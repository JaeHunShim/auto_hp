package com.auto_hp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.auto_hp.domain.UserVO;

@Mapper
public interface UserMapper {

	@Insert("insert into user values(#{user_email},#{user_pw},#{user_nick}"
			+ ",#{user_address},#{user_address2},#{user_tel},now(),now())")
	public void signUpUser(UserVO userVO) throws Exception;
	
	@Select("select user_email,user_pw from user where user_email=#{user_email} and user_pw=#{user_pw}")
	public UserVO loginUser(UserVO userVO) throws Exception;
}
