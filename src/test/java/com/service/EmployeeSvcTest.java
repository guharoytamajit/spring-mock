package com.service;

import static org.mockito.Mockito.doReturn;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.config.SpringMvcConfig;
import com.dao.EmployeeDao;
import com.dao.InfoDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringMvcConfig.class })
public class EmployeeSvcTest {
	@InjectMocks
	@Autowired
	EmployeeSvc employeeSvc;
	@Mock
	EmployeeDao employeeDao;

	@Spy
	@Autowired
	InfoDao infoDao;
@Test
	public void testFetchEmployeeById() {
		doReturn("Tamajit").when(employeeDao).fetchEmployeeById(1);
		Mockito.when(infoDao.getMessage(Matchers.any(String.class))).thenReturn("info");
		String id = employeeSvc.fetchEmployeeById(1);
		System.out.println(id);
		String info = employeeSvc.getInfo("abc");
		System.out.println(info);
	}

@Before
public void setup() {
        MockitoAnnotations.initMocks(this);
	//use MockitoAnnotations.openMocks(this) as initMocks() is deprecated
}
}
