package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.ManagerData;

public interface ManagerRepository extends CrudRepository<ManagerData, Integer>{

	public ManagerData findById(int id);
	public ManagerData findByName(String name);
}
