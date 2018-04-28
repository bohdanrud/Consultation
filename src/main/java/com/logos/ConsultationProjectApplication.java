package com.logos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.logos.entity.User;
import com.logos.entity.enums.UserRole;
import com.logos.repository.UserRepository;

@SpringBootApplication
public class ConsultationProjectApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(ConsultationProjectApplication.class);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		= SpringApplication.run(ConsultationProjectApplication.class, args);
		addAdmin(context);
		
	}
	
	static void addAdmin(ConfigurableApplicationContext context) {
		String login = "admin";
		String password = "123";
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user = userRepository.findUserByLogin(login);
		
		if (user == null) {
			PasswordEncoder passwordEncoder = context.getBean(PasswordEncoder.class);
			user = new User();
			user.setLogin(login);
			user.setPassword(passwordEncoder.encode(password));
			user.setRole(UserRole.ROLE_ADMIN);
			userRepository.save(user);
		}
	}
}
