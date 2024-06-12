package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.EmployeesData;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employeesdata")
	public List<EmployeesData> getAllEmployees() {
		List<EmployeesData> list = employeeService.getAllEmployees();
		return list;
	}
	
	@GetMapping("/employeedata/{id}")
	public EmployeesData getEmployeeById(@PathVariable("id")int id) {
		EmployeesData emp = employeeService.getEmployeeById(id);
		return emp;
	}

	@GetMapping("/employeesdata/{name}")
	public EmployeesData getEmployeeByName(@PathVariable("name")String name) {
		EmployeesData emp = employeeService.getEmployeeByName(name);
		return emp;
	}

	@PostMapping("/employeesdata")
	public EmployeesData addEmployee(@RequestBody EmployeesData employee) {
		EmployeesData emp = employeeService.addEmployee(employee);
		return emp;
	}
	
	@DeleteMapping("/employeesdata/{id}")
	public void deleteEmployeeById(@PathVariable("id") int id)
	{
		employeeService.deleteEmployeeById(id);
	}
	
	@PutMapping("/employeesdata/{id}")
	public void updateEmployeeById(@RequestBody EmployeesData employee,@PathVariable int id)
	{
		employee.setId(id);
		employeeService.updateEmployeeById(employee, id);
	}

	
}
