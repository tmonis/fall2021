package com.hcl.travel.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hcl.travel.model.UserDetails;
import java.util.Optional;

@Service
public interface UserService {
		
		UserDetails saveUser(UserDetails details);
		Optional<UserDetails> deleteUser(long userId_pk);
		Optional<UserDetails> findUserDetails(long userId_pk);
		UserDetails updateUser(long userId_pk, UserDetails details);
		void deleteAll();
		List<UserDetails> findUsers(UserDetails details);

}
