package com.auto_hp.service;


import org.springframework.stereotype.Service;

import com.auto_hp.domain.SiteInformation;

@Service
public class SInformationServiceImpl implements SInformationService{
	
	
	@Override
	public SiteInformation siteName(SiteInformation s_Info) throws Exception {
		
		SiteInformation sInfo = new SiteInformation();
		
		sInfo.setSite_name(s_Info.getSite_name());
		sInfo.setSite_perpose(s_Info.getSite_perpose());
		
		return sInfo;
	}

	@Override
	public SiteInformation domainName(SiteInformation sInfo) throws Exception {
		
		SiteInformation info = new SiteInformation();
		
		info.setDomain_name(sInfo.getDomain_name()+".com");
		System.out.println("도메인 이름 " + info.getDomain_name() );
		
		return info;
	}

}
