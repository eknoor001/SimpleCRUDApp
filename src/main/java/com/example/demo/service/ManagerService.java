package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ManagerData;
import com.example.demo.repository.ManagerRepository;

@Service
public class ManagerService {

	@Autowired
	private ManagerRepository managerRepository;

	public List<ManagerData> getAllManagers() {
		List<ManagerData> list = (List<ManagerData>) managerRepository.findAll();
		return list;
	}

	public ManagerData getManagerById(int id) {
		ManagerData man = managerRepository.findById(id);
		return man;
	}

	public ManagerData getManagerByName(String name) {
		ManagerData man = managerRepository.findByName(name);
		return man;
	}

	public ManagerData addManager(ManagerData manager) {
		ManagerData man = managerRepository.save(manager);
		return man;
	}

	public void deleteManagerById(int id) {
		managerRepository.deleteById(id);
	}

	public void updateMangerById(ManagerData manager, int id) {
		manager.setManager_id(id);
		managerRepository.save(manager);
	}

}
