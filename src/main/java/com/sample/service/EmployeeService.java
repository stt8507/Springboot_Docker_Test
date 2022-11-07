package com.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.dto.EmployeeDTO;
import com.sample.entity.Employee;

@Service
public interface EmployeeService {

	void findById(long id);
	
	void insertEmployee(EmployeeDTO employeeDTO);
	
	void updateEmployee(EmployeeDTO employeeDTO);
	
	void deleteEmployee(EmployeeDTO employeeDTO);
	
	List<Employee> findEmployeesAndPass();
}
