/**
 * @author: 심재훈
 * @date:2018-10-5
 * @filename:UserVO
 * @function: user정보에 대한 VO객체 
 * @version:0.0.1
 */
package com.auto_hp.domain;

import java.util.Date;

import lombok.Data;

@Data
public class UserVO {
	
	private String user_email;
	private String user_pw;
	private String user_nick;
	private Integer user_tel;
	private String user_address;
	private String user_address2;
	private Date regdate;
	private Date update_date;
}
