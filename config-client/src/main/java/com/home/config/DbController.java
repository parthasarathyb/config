package com.home.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

	
	@Value("${driverClassName}")
	private String driverClassName;
	
	@Value("${url}")
	private String url;
	
	@Value("${username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	
	
	@RequestMapping(value="/db", method=RequestMethod.GET)
	public String getDbConfig(){
		
		Map<String,String> map = new HashMap<>();
		map.put("driverClassName", driverClassName);
		map.put("url", url);
		map.put("username", username);
		map.put("password", password);
		
		return map.toString();
	}
	
}
