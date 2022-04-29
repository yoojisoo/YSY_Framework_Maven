package com.ysy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ysy.model.TestModel;

public interface TestRepository  extends JpaRepository<TestModel, Integer>{

	
}
