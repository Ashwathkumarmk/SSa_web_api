package com.ashwath.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashwath.binding.SsaWebRequest;
import com.ashwath.binding.SsaWebResponse;
import com.ashwath.service.SsaWebService;

@RestController
public class SsaWebRestController {
@Autowired
	private SsaWebService service;
@PostMapping("/ssa")
public SsaWebResponse getCitizenInfo(@RequestBody SsaWebRequest req) {
	SsaWebResponse citizenInfo = service.getCitizenInfo(req);
	return citizenInfo;
}
}
