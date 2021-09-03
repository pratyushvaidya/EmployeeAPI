package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	@Autowired 
	public EmployeeService(EmployeeRepository employeeRepository){
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	public void addNewEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public List<Employee> searchEmployee(String name) {
		return employeeRepository.findByName(name);	
	}
	
	public void deleteByCity(String name, String city) {
		System.out.println(employeeRepository.deleteByNameAndCity(name, city));
	}
	
	public void temp(String name) {
		employeeRepository.deleteByName(name);
	}
	
}
