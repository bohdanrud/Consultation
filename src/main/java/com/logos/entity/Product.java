package com.logos.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@NoArgsConstructor
@Getter
@Setter
public class Product extends BaseEntity{
	
	private String title;
	
	@Column(length = 500)
	private String description;
	
	private int rating;
	
	private BigDecimal price;
	
	@Column(name = "image_url")
	private String imageUrl;

}
