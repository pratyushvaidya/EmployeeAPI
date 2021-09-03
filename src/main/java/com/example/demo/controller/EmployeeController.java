package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping
	public List<Employee> getEmployees() {
		return empService.getEmployees();
	}
	
	@PostMapping
	public void registerEmployee(@RequestBody Employee employee) {
		empService.addNewEmployee(employee);
	}
	
	@GetMapping(path = "/{name}")
	public List<Employee> search(@PathVariable("name") String name) {
		return empService.searchEmployee(name);
	}
	
	@DeleteMapping(path = "/{name}/{city}")
	public void delete(@PathVariable("name") String name, @PathVariable("city") String city) {
		empService.deleteByCity(name, city);
	}
	
	@DeleteMapping(path = "/delete/{name}")
	public void deleteName(@PathVariable("name") String name) {
		empService.temp(name);
	}
}
