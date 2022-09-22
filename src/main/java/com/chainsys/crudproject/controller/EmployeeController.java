package com.chainsys.crudproject.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.crudproject.model.Employees;
import com.chainsys.crudproject.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("addEmployee")
	public String addEmployee(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("age") int age, @RequestParam("designation") String designation, @RequestParam("salary") int salary,
			@RequestParam("joiningDate") Date joiningDate) {
		Employees employee =new Employees();
		employee.setId(id);
		employee.setName(name);
		employee.setAge(age);
		employee.setDesignation(designation);
		employee.setJoiningDate(joiningDate);
		employee.setSalary(salary);
		employeeService.addEmployee(employee);
		return "deleteform";
	}
	
	@GetMapping("deleteEmployee")
	public String deleteEmployee(@RequestParam("id") int id) {
		employeeService.removeEmp(id);
		return "getEmployeeList";
	}
	
	@GetMapping("getEmployeeList")
	public String getEmployeeList(Model model) {
		List<Employees> allEmpList = employeeService.allEmpList();
		List<Employees> allEmpListByDesignation = employeeService.allEmpListByDesignation("Trainee Programmer");
		Optional<Employees> fetchEmpById = employeeService.fetchEmpById(101);
		model.addAttribute("emp", allEmpList);
		model.addAttribute("empByDes", allEmpListByDesignation);
		model.addAttribute("empById", fetchEmpById);
		return "allEmployee";
	}
	
	
}
