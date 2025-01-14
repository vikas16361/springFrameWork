package com.vikas.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vikas.model.UserDto;
@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	JdbcTemplate jdbc;
	@Override
	public int registrationUser(UserDto user) {
		String sql="insert into tb1_user(user_name,user_email,user_password,country,gender) values(?,?,?,?,?)";
		try {
			return jdbc.update(sql,user.getName(),user.getUserName(),user.getPassword());
		}catch(Exception e){
			System.out.println(e);
			return 0;
		}
	
	}

}
