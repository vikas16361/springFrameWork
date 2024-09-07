package com.vikas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikas.dao.UserDAO;
import com.vikas.model.UserDto;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO repo;
	@Override
	public boolean registrationUser(UserDto user) {
		return repo.registrationUser(user)>0? true:false;
		
	}

}
