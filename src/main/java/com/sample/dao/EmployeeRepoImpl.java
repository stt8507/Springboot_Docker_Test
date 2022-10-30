package com.sample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sample.entity.Employee;
import com.sample.entity.QEmployee;

@Component
public class EmployeeRepoImpl{

	@Autowired
    private JPAQueryFactory queryFactory;

	public Employee findIdEqual1() {
		return queryFactory
		.selectFrom(QEmployee.employee)
		.where(
				QEmployee.employee.id.eq((long) 1)
            ).fetchFirst();
	}
}
