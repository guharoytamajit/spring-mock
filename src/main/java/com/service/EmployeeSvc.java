package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.dao.IEmployeeDao;
import com.dao.InfoDao;

@Service
public class EmployeeSvc implements IEmployeeSvc {
	@Autowired
IEmployeeDao dao;
	@Autowired
	InfoDao infoDao;
	@Override
	public String fetchEmployeeById(int id) {
		return dao.fetchEmployeeById(id);
	}
	@Override
	public String getInfo(String s) {
		
		return infoDao.getMessage(s);
	}


}
