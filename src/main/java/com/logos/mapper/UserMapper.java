package com.logos.mapper;

import org.springframework.security.core.authority.AuthorityUtils;

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
	
	public static org.springframework.security.core.userdetails.User toSecurityUser(User user){
		
		return new org.springframework.security.core.userdetails.User(
				user.getLogin(),
				user.getPassword(),
				AuthorityUtils.createAuthorityList(String.valueOf(user.getRole()))
				);
		
	}
	
}
