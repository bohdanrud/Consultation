package com.logos.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logos.repository.UserRepository;

@Component
public class CheckIfEmailExistsValidator implements ConstraintValidator<CheckIfEmailExists, String>{

	@Autowired
	private UserRepository ur;
	
	@Override
	public boolean isValid(String email, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if (ur.findUserByEmail(email) != null) {
			return false;
		} else {
			return true;
		}
		
	}

}
