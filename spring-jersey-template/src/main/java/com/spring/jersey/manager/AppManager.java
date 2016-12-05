package com.spring.jersey.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.jersey.dao.AppDao;

@Component
public class AppManager {

	@Autowired
	private AppDao dao;
	
	public String getMessage(){
		return dao.getMessage();
	}
}
