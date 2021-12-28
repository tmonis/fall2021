package com.hcl.travel.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import com.hcl.travel.request.UserDetailsRequest;
import com.hcl.travel.response.UserDetailsResponse;
import com.hcl.travel.model.UserDetails;
import java.util.UUID;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserDetailsMapper {
	
	@Mapping(target = "guid", expression = "java(getGUID())") // GET GUID FROM THE RANDOM GENERATED GUID METHOD 
	UserDetails getUserDetails(UserDetailsRequest userDetailsRequest);
	
	@Mapping(target = "firstName", source = "firstName")
	UserDetailsResponse getUserDetailsResponse(UserDetails userDetails);
	
	default String getGUID() { //
		return UUID.randomUUID().toString(); // CALCULATES RANDOM GUID TO STORE INTO TARGET = GUID
	}

}
