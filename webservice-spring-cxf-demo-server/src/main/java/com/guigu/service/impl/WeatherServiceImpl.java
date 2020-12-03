package com.guigu.service.impl;

import com.lovecws.mumu.demo.cxf.service.WeatherService;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * 天气服务实现类
 * 
 * @author ganliang
 */
@WebService
public class WeatherServiceImpl implements WeatherService {

	@Override
	public String get(@WebParam(name = "mobileCode") String mobileCode, @WebParam(name = "userID") String userID) {
		return "mobileCode";
	}

	@Override
	public String[] getDatabaseInfo() {
		return new String[]{"getDatabaseInfo"};
	}

}
