package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ManagerData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int manager_id;
	private String name;
	@OneToMany(mappedBy = "manager")
	@JsonManagedReference
	private List<EmployeesData> employee;
	public ManagerData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ManagerData(int manager_id, String name, List<EmployeesData> employee) {
		super();
		this.manager_id = manager_id;
		this.name = name;
		this.employee = employee;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<EmployeesData> getEmployee() {
		return employee;
	}
	public void setEmployee(List<EmployeesData> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "ManagerData [manager_id=" + manager_id + ", name=" + name + ", employee=" + employee + "]";
	}
	
	
}
