package com.auto_hp.service;

import com.auto_hp.domain.SiteInformation;

public interface SInformationService {
	
	public SiteInformation siteName(SiteInformation s_Info) throws Exception;
	
	public SiteInformation domainName(SiteInformation sInfo) throws Exception;
}
