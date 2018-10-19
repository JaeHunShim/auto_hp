/**
 * @author: 심재훈
 * @date:2018-10-5
 * @filename:SiteInformation.java
 * @function:사이트 정보에 관련 정보객체
 * @version:0.0.1
 */
package com.auto_hp.domain;

import lombok.Data;

@Data
public class SiteInformation {
	
	private String user_email;
	private String site_name;
	private String site_purpose;
	private String domain_name;
	private String domain_price;
	private String url;
}
