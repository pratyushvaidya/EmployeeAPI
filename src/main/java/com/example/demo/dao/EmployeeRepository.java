package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Employee;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	List<Employee> findByName(String name);
	void deleteByName(String name);
	@Modifying
	@Query(value = "delete from employee where name=?1 and city=?2", nativeQuery = true)
	int deleteByNameAndCity(String name, String city);
}
