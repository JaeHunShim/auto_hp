package com.auto_hp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto_hp.domain.UserVO;
import com.auto_hp.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void  signup(UserVO userVO) throws Exception {
		
		userMapper.signUpUser(userVO);
	}
	public UserVO login(UserVO userVO) throws Exception {
		
		return userMapper.loginUser(userVO);
	}
}
