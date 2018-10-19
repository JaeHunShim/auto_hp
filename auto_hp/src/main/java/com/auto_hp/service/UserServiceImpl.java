/**
 * @author: 심재훈
 * @date:2018-10-5
 * @filename:UserServiceImpl.java
 */
package com.auto_hp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto_hp.domain.UserVO;
import com.auto_hp.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	/**
	 * @author: 심재훈
	 * @date:2018-10-5
	 * @method: signUp
	 * @param : UserVO 객체
	 * @return :UserVO 객체
	 * @function: 회원가입 관련된 mapper 데이터 처리 
	 */
	@Override
	public void  signup(UserVO userVO) throws Exception {
		
		userMapper.signUpUser(userVO);
	}
	/**
	 * @author: 심재훈
	 * @date:2018-10-5
	 * @method: login
	 * @param : UserVO 객체
	 * @return :UserVO 객체
	 * @function:로그인관련된 mapper 데이터 처리 
	 */
	@Override
	public UserVO login(UserVO userVO) throws Exception {
		
		return userMapper.loginUser(userVO);
	}
}
