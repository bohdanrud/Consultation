package com.logos.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.logos.entity.User;
import com.logos.mapper.UserMapper;
import com.logos.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User entity = userRepository.findUserByLogin(login);
		if(entity == null) throw new UsernameNotFoundException("User not found!");
		
		return UserMapper.toSecurityUser(entity);
	}

}
