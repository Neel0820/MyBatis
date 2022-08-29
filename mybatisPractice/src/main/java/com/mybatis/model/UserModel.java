package com.mybatis.model;

/**
 * This is model class. Here declare all needed entities,
 * and generate getter and setter for it. 
 */
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// This Lombok annotation is for creating Getter and Setter for all entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

	private Integer id;
	private String firstName;
	private String lastName;

}
