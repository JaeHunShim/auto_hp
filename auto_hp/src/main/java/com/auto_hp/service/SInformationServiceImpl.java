/**
 * @author: 심재훈
 * @date:2018-10-17
 * @filename:SInformationServiceImpl.java
 */
package com.auto_hp.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto_hp.domain.SiteInformation;
import com.auto_hp.mapper.InfoMapper;

@Service
public class SInformationServiceImpl implements SInformationService{
	
	@Autowired
	private InfoMapper infoMapper;
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
	 * @return :List<SiteInformation> 객체
	 * @function: 도메인이름을 만드는 처리 
	 * @version:0.0.1
	 */
	@Override
	public List<SiteInformation> domainName(SiteInformation sInfo) throws Exception {
		
		List<SiteInformation> infoList = new ArrayList<SiteInformation>();
		
		String[] dotList = {"Free.com","Pay.net"};
		String[] payList = {"무료", "유료"};
		
		for(int i=0; i<dotList.length; i++) {
			SiteInformation info = new SiteInformation();
			info.setDomain_name(sInfo.getDomain_name()+dotList[i]);
			info.setDomain_price(payList[i]);
			infoList.add(info);
		}
		System.out.println("list정보:" + infoList);
		return infoList;
	}
}
