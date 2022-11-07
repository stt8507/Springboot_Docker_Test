package com.sample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sample.entity.Employee;
import com.sample.entity.Post;
import com.sample.entity.QEmployee;
import com.sample.entity.QPost;

@Component
public class EmployeeRepoImpl{

	@Autowired
    private JPAQueryFactory queryFactory;
	
	@Autowired
	PostDao postDao;

	public List<Post> findIdEqual1() {
		return postDao.findAll();
		
	}
}
