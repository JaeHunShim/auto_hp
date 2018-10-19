/**
 * @author: 심재훈
 * @date:2018-10-5
 * @filename:UserMapper.java
 */
package com.auto_hp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.auto_hp.domain.UserVO;

@Mapper
public interface UserMapper {
	/**
	 * @author: 심재훈
	 * @date:2018-10-05
	 * @method:siginUpUser
	 * @param :UserVO형태
	 * @return :void
	 * @function : 회원가입처리에 관련된 DB처리 
	 * @version:0.0.1
	 */
	@Insert("insert into user values(#{user_email},#{user_pw},#{user_nick}"
			+ ",#{user_address},#{user_address2},#{user_tel},now(),now())")
	public void signUpUser(UserVO userVO) throws Exception;
	/**
	 * @author: 심재훈
	 * @date:2018-10-05
	 * @method:loginUser
	 * @param :UserVO형태
	 * @return :UserVO 객체 
	 * @function :로그인 처리에 관련된 DB처리 
	 * @version:0.0.1
	 */
	@Select("select user_email,user_pw from user where user_email=#{user_email} and user_pw=#{user_pw}")
	public UserVO loginUser(UserVO userVO) throws Exception;
}
