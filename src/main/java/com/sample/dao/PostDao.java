package com.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import com.sample.entity.Post;

@Repository
public interface PostDao extends JpaRepository<Post, String>, 
	JpaSpecificationExecutor<Post>{

}
