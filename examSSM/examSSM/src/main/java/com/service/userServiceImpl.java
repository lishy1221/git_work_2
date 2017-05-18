package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.userDao;
import com.entity.User;

@Service("userService")
public class userServiceImpl implements userService{
    @Resource
	private userDao dao;
    
	public User findUser(int user_id) {
		// TODO Auto-generated method stub
		return dao.getUserById(user_id);
	}

}
