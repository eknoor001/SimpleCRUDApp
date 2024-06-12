package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.EmployeesData;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<EmployeesData> getAllEmployees() {
		List<EmployeesData> list = (List<EmployeesData>) employeeRepository.findAll();
		return list;
	}

	public EmployeesData getEmployeeById(int id) {
		EmployeesData emp = employeeRepository.findById(id);
		return emp;
	}

	public EmployeesData getEmployeeByName(String name) {
		EmployeesData emp = employeeRepository.findByName(name);
		return emp;
	}

	public EmployeesData addEmployee(EmployeesData employee) {
		EmployeesData emp = employeeRepository.save(employee);
		return emp;
	}
	
	public void deleteEmployeeById(int id)
	{
		employeeRepository.deleteById(id);
	}
	
	public void updateEmployeeById(EmployeesData employee, int id)
	{
		employee.setId(id);
		employeeRepository.save(employee);
	}

}
