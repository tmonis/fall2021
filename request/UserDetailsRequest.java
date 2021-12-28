package com.hcl.travel.request;

import lombok.Data;

@Data
public class UserDetailsRequest {
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;

}
