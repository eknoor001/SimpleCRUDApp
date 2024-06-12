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

import com.example.demo.entities.ManagerData;
import com.example.demo.service.ManagerService;

@RestController
public class ManagerController {

	@Autowired
	private ManagerService managerService;
	
	@GetMapping("/managersdata")
	public List<ManagerData> getAllManagers() {
		List<ManagerData> list = managerService.getAllManagers();
		return list;
	}
	
	@GetMapping("/managerdata/{id}")
	public ManagerData getManagerById(@PathVariable("id")int id) {
		ManagerData man = managerService.getManagerById(id);
		return man;
	}

	@GetMapping("/managersdata/{name}")
	public ManagerData getManagerByName(@PathVariable("name")String name) {
		ManagerData man = managerService.getManagerByName(name);
		return man;
	}

	@PostMapping("/managersdata")
	public ManagerData addEmployee(@RequestBody ManagerData manager) {
		ManagerData man = managerService.addManager(manager);
		return man;
	}
	
	@DeleteMapping("/managersdata/{id}")
	public void deleteManagerById(@PathVariable("id") int id)
	{
		managerService.deleteManagerById(id);
	}
	
	@PutMapping("/managersdata/{id}")
	public void updateManagerById(@RequestBody ManagerData manager,@PathVariable int id)
	{
		manager.setManager_id(id);
		managerService.updateMangerById(manager, id);
	}

	
}
