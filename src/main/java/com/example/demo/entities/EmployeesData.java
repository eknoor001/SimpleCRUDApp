package com.example.demo.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeesData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String department;
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private ManagerData manager;
	public EmployeesData() {
		super();
		
	}
	public EmployeesData(int id, String name, String department, ManagerData manager) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.manager = manager;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public ManagerData getManager() {
		return manager;
	}
	public void setManager(ManagerData manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "EmployeesData [id=" + id + ", name=" + name + ", department=" + department + ", manager=" + manager
				+ "]";
	}
	
	
	
}
