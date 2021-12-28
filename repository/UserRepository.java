package com.hcl.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.travel.model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long>{

}
