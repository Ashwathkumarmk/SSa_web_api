package com.ashwath.service;

import com.ashwath.binding.SsaWebRequest;
import com.ashwath.binding.SsaWebResponse;

public interface SsaWebService {
	
	public SsaWebResponse getCitizenInfo(SsaWebRequest request);

}
