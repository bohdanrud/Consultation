package com.logos.domain;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddUserRequest {

	@NotEmpty
	private String login;
	
	@NotEmpty
	private String email;

	@NotEmpty
	private String password;
	
	@NotEmpty
	private String passwordConfirmation;


}
