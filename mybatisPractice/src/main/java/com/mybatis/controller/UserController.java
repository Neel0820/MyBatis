package com.mybatis.controller;

/**
 * This controller class is created to control all requests from the client.
 */
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybatis.model.UserModel;
import com.mybatis.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	UserService userService;

	/*
	 * This method is created to handle GET requests.
	 */
	@GetMapping
	public List<UserModel> getAllUser() throws IOException {
		return userService.getAllUser();
	}

}
