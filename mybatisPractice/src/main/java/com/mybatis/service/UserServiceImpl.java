package com.mybatis.service;

/**
 * This class created is for implementing the abstract method of the service interface.
 */
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.mapper.UserMapper;
import com.mybatis.model.UserModel;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	/*
	 * This method is implemented by the service interface,
	 * and for the call the method of mapper class.
	 */
	@Override
	public List<UserModel> getAllUser() throws IOException {
		return userMapper.getAllUser();
	}

}
