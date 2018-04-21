package com.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_details")
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class UserDetails extends BaseEntity{
	
	@Column(name = "first_name", length = 30)
	private String firstName;
	
	@Column(name = "last_name", length = 30)
	private String lastName;
	
	private int age;
	
	@Column(name = "description", length = 1000)
	private String description;
}
