package com.guigu.service.impl;

import com.lovecws.mumu.demo.cxf.service.HelloWorldService;

import javax.jws.WebService;

@WebService
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String sayHello() {
		return "Hello world!";
	}
}
