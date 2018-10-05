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
