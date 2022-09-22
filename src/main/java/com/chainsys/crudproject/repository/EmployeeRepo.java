package com.chainsys.crudproject.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.crudproject.model.Employees;

@Repository
public interface EmployeeRepo extends JpaRepository<Employees, Integer>{
	
	<S extends Employees> S save(S employees);

	public void deleteById(int id);
	
	public Optional<Employees> findById(int id);
	
	public List<Employees> findAllByDesignation(String designation);
	
	public List<Employees> findAll();	
	
}
