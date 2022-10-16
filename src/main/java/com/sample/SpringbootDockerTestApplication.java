package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.dao.EmployeeDao;

@RestController
@SpringBootApplication
public class SpringbootDockerTestApplication {

	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("saas");
	   return employeeDao.findAll().get(0).getName();
	}	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerTestApplication.class, args);
	}

}
