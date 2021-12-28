package com.hcl.travel.model;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "user_details")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "USER_ID_PK") // primary key & not required to take from user 
	@Getter @Setter private long userId_pk;
	
	@Column(name = "FIRST_NAME") //user first name
	@Getter @Setter private String firstName;
	
	@Column(name = "LAST_NAME") // user last name
	@Getter @Setter private String lastName;
	
	@Column(name = "PASSWORD") // user password
	@Getter @Setter private String password;
	
	@Column(name = "EMAIL") // user email
	@Getter @Setter private String email;
	
	@Column(name = "ADMIN")
	@Getter @Setter private boolean isAdmin; // is user admin
	
//	@Column(name = "DESTINATION_INFO")
//	private String destinationService; // info must be from Destination service
//	
//	@Column(name = "DESTINATION_REVIEWS")
//	private String destinationReviews;
//	
//	@Column(name = "DEST_RECOMMENDATIONS")
//	private String destinationRecommend;
	
	@Column(name = "GUID")
	@Getter @Setter private String guid;
	
//	@Column(name ="USER_GUID") // not required to take from user
//	private Long user_guid;
	
}
