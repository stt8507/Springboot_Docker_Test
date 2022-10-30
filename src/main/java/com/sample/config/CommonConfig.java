package com.sample.config;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Configuration
public class CommonConfig {

	@Autowired
	private EntityManager entityManager;
	
	@Bean
	public JPAQueryFactory getJPAFactory() {
		return new JPAQueryFactory(entityManager);
	}
}
