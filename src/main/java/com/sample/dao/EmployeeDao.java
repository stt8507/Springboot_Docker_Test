package com.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import com.sample.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>, 
	JpaSpecificationExecutor<Employee>{

}
