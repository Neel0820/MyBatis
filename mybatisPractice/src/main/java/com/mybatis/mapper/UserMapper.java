package com.mybatis.mapper;

/**
 * This class is created for a map to the mapper configuration file
 */
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import com.mybatis.model.UserModel;

@Repository
public class UserMapper {

	/*
	 * This method is for creating a session and getting data using an XML file
	 */
	public List<UserModel> getAllUser() throws IOException {
		Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		List<UserModel> userList = session.selectList("getAllUser");
		return userList;
	}

}
