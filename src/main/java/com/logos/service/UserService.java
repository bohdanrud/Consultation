package com.logos.service;

import java.util.List;

import com.logos.entity.User;



public interface UserService {
	
	void saveUser(User user);
	
	User findUserById(int id);
	
	List<User> findAllUsers();
	
	User findUserByLogin(String login);

	User findUserByEmail(String email);
	
	void updateUser(User user);
}
