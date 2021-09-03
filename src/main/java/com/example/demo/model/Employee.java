package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@SequenceGenerator(
			name = "employee_sequence",
			sequenceName = "employee_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "employee_sequence"
	)
	private Long id;
	private String name;
	private String address;
	private String city;
	private String country;
	
	public Employee() {
	}

	public Employee(String name, String address, String city, String country) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.country = country;
	}

	public Employee(Long id, String name, String address, String city, String country) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee {id='" + id + "', name='" + name + "', address='" + address + "', city='" 
				+ city + "', country='" + country + "'}";
	}
	
}
