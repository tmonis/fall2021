package com.hcl.travel.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.travel.model.UserDetails;
import com.hcl.travel.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override // SAVE USER INFO
	public UserDetails saveUser(UserDetails details) {
		details.setGuid(UUID.randomUUID().toString()); 
		return userRepository.save(details);
	}
	
	@Override // GET USER VIA ID
	public Optional<UserDetails> findUserDetails(long userId_pk) {
		return userRepository.findById(userId_pk);
	}

	@Override // DELETES USER
	public Optional<UserDetails> deleteUser(long userId_pk) {
		Optional <UserDetails> deleted = userRepository.findById(userId_pk); // FIND THE ID YOU WANT TO DELETE
		userRepository.deleteById(userId_pk);
		return deleted;
	}

	@Override // UPDATES USER .. PUT
	public UserDetails updateUser(long userId_pk, UserDetails details) {
		Optional<UserDetails> original = userRepository.findById(userId_pk);
		if (original.isPresent()) {
			if(details.getFirstName() == null) {
				details.setFirstName(original.get().getFirstName());
			}
			if(details.getLastName() == null) {
				details.setLastName(original.get().getLastName());
			}
			if(details.getPassword() == null) {
				details.setPassword(original.get().getPassword());
			}
			if(details.getEmail() == null) {
				details.setEmail(original.get().getEmail());
			}
			details.setUserId_pk(userId_pk);
			details.setGuid(original.get().getGuid());
			// details.setIsAdmin(original.get().getIsAdmin());
			return userRepository.save(details);
		}
		return null;
	}
	
	@Override // EMPTIES THE DATABASE
	public void deleteAll() {
		  try {
	            userRepository.deleteAll();
	        } catch (Exception e) {
	        	System.out.println(e);
	       }
//		for(UserDetails details : userRepository.findAll()) {
//			System.out.println(details.getUserId_pk());
//			this.deleteUser(details.getUserId_pk());
//		}
	}

	@Override
	public List<UserDetails> findUsers(UserDetails details) {
		// TODO Auto-generated method stub
		return null;
	}

}
