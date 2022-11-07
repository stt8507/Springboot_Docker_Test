package com.sample.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "employee")
public class Employee {

	@Id
    private long id;

    private String name;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
    private List<Post> posts;
}
