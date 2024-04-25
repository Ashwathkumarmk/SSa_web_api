package com.ashwath.service;

import org.springframework.stereotype.Service;

import com.ashwath.binding.SsaWebRequest;
import com.ashwath.binding.SsaWebResponse;
@Service
public class SsaWebServiceImpl  implements SsaWebService{

	@Override
	public SsaWebResponse getCitizenInfo(SsaWebRequest request) {
		SsaWebResponse response=new SsaWebResponse();
		Long ssn = request.getSsn();
		String ssnStr = String.valueOf(ssn);
		if(ssnStr.startsWith("1")) {
			response.setName("New Jersey");
		}else if(ssnStr.startsWith("2")) {
			response.setName("Dallas");
		}else if(ssnStr.startsWith("3")) {
			response.setName("Houston");
		}else if(ssnStr.startsWith("4")) {
			response.setName("Rhode Island");
		}else if(ssnStr.startsWith("5")) {
			response.setName("Los Angles");
		}else if(ssnStr.startsWith("6")) {
			response.setName("atlanta");
		}else if(ssnStr.startsWith("7")) {
			response.setName("Kentuki");
		}else if(ssnStr.startsWith("8")) {
			response.setName("phoenix");
		}else if(ssnStr.startsWith("9")) {
			response.setName("Texas");
		}
	response.setSsn(ssn);
		return response;
	}

}
