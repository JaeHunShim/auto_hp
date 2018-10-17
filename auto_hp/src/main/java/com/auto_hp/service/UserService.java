package com.auto_hp.service;

import com.auto_hp.domain.UserVO;

public interface UserService {

	public void signup(UserVO userVO) throws Exception;
	
	public UserVO login(UserVO userVO) throws Exception;
}
