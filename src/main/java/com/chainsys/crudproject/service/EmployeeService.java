package com.chainsys.crudproject.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.crudproject.model.Employees;
import com.chainsys.crudproject.repository.EmployeeRepo;
@Service
public class EmployeeService {
@Autowired 
private EmployeeRepo repo;

public void addEmployee(Employees emp) {
	 repo.save(emp);
}
	
public void removeEmp(int id) {
	 repo.deleteById(id);
}
public List<Employees> allEmpList(){
	return repo.findAll();
}
public List<Employees> allEmpListByDesignation(String designation){
	return repo.findAllByDesignation(designation);
}
public Optional<Employees> fetchEmpById(int id) {
	return repo.findById(id);
}

}
