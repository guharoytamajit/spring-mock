package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao implements IEmployeeDao {
	
	@Override
	public String fetchEmployeeById(int id) {
		if(id==1)return "alex";
		if(id==2)return "jack";
		if(id==3)return "andy";
		if(id==4)return "robin";
		return "unknown";
	}

}
