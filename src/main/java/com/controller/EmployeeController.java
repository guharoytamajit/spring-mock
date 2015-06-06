package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.EmployeeSvc;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
	@Autowired
	EmployeeSvc employeeSvc;

	@RequestMapping(value = "/info/{eid}.htm", method = RequestMethod.GET)
	public String name(@PathVariable Integer eid,ModelMap map) {
		String empName = employeeSvc.fetchEmployeeById(eid);
		map.put("empName", empName);
		return "employee";
	}
}
