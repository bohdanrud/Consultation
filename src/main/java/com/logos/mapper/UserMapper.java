package com.logos.mapper;

import com.logos.domain.AddUserRequest;
import com.logos.entity.User;
import com.logos.entity.enums.UserRole;

public interface UserMapper {

	public static User addUserRequestToUser(AddUserRequest request) {
		
		User user = new User();
		user.setEmail(request.getEmail());
		user.setLogin(request.getLogin());
		user.setPassword(request.getPassword());
		user.setRole(UserRole.ROLE_USER);
		
		return user;
	}
	
}
