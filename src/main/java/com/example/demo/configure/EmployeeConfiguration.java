/*
 * package com.example.demo.configure;
 * 
 * import java.util.List;
 * 
 * import org.springframework.boot.CommandLineRunner; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * import com.example.demo.dao.EmployeeRepository; import
 * com.example.demo.model.Employee;
 * 
 * @Configuration public class EmployeeConfiguration {
 * 
 * @Bean CommandLineRunner commandLineRunner(EmployeeRepository
 * employeeRepository) { return args -> { Employee someone = new Employee( 1L,
 * "Someone", "Somewhere", "Someplace", "India" ); Employee someoneElse = new
 * Employee( 2L, "Someone else", "Somewhere else", "someplace else", "Japan" );
 * Employee employee = new Employee( 3L, "name", "address", "city", "country" );
 * employeeRepository.saveAll( List.of(someone, someoneElse, employee) ); }; } }
 */