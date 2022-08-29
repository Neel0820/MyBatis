package com.mybatis.service;

/**
 * This is Service interface for create abstract method.
 */
import java.io.IOException;
import java.util.List;

import com.mybatis.model.UserModel;

public interface UserService {

	/*
	 * This abstract method is call by controller class.
	 */
	public List<UserModel> getAllUser() throws IOException;

}
