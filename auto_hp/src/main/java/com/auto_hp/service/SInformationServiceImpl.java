/**
 * @author: 심재훈
 * @date:2018-10-17
 * @filename:SInformationServiceImpl.java
 */
package com.auto_hp.service;


import org.springframework.stereotype.Service;

import com.auto_hp.domain.SiteInformation;

@Service
public class SInformationServiceImpl implements SInformationService{
	/**
	 * @author: 심재훈
	 * @date:2018-10-17
	 * @method: siteName
	 * @param : UserVO 객체
	 * @return :UserVO 객체
	 * @function: 사이트이름을 만드는 데이터 처리 
	 * @version:0.0.1
	 */
	@Override
	public SiteInformation siteName(SiteInformation s_Info) throws Exception {
		
		SiteInformation sInfo = new SiteInformation();
		
		sInfo.setSite_name(s_Info.getSite_name());
		sInfo.setSite_purpose(s_Info.getSite_purpose());
		
		return sInfo;
	}
	/**
	 * @author: 심재훈
	 * @date:2018-10-17
	 * @method: doaminName
	 * @param : SiteInformation 객체
	 * @return :SiteInformation 객체
	 * @function: 도메인이름을 만드는 처리 
	 * @version:0.0.1
	 */
	@Override
	public SiteInformation domainName(SiteInformation sInfo) throws Exception {
		
		SiteInformation info = new SiteInformation();
		
		info.setDomain_name(sInfo.getDomain_name()+".com");
		System.out.println("도메인 이름 " + info.getDomain_name() );
		
		return info;
	}

}
