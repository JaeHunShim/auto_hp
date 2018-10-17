package com.auto_hp.service;


import org.springframework.stereotype.Service;

import com.auto_hp.domain.SiteInformation;

@Service
public class SInformationServiceImpl implements SInformationService{
	
	
	@Override
	public SiteInformation domainName(SiteInformation s_Info) throws Exception {
		
		SiteInformation sInfo = new SiteInformation();
		
		sInfo.setSite_name(s_Info.getSite_name());
		sInfo.setSite_perpose(s_Info.getSite_perpose());
		
		return sInfo;
	}
}
