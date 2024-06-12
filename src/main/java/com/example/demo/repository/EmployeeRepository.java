package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.EmployeesData;

public interface EmployeeRepository extends CrudRepository<EmployeesData, Integer>{

	public EmployeesData findById(int id);
	public EmployeesData findByName(String name);
}
