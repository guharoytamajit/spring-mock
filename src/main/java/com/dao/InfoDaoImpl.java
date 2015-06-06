package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InfoDaoImpl implements InfoDao{
@Autowired
	TestDao testDao;
	@Override
	public String getMessage(String s) {
		return "Hello "+s;
	}

}
