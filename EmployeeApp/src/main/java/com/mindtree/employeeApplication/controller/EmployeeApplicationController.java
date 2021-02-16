package com.mindtree.employeeApplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.employeeApplication.entity.Employee;
import com.mindtree.employeeApplication.service.Impl.EmployeeApplicationImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeApplicationController {

	@Autowired
	private EmployeeApplicationImpl employeeService;
	
	@GetMapping("/{id}")
	public Employee getUserById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/all")
	public List<Employee> getEmployeeDetails(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.addNewEmployee(employee);
	}
	
	@DeleteMapping("/deleteBy/{id}")
	public Employee deleteEmployee(Employee employee, @PathVariable(value="id") int id) {
		return employeeService.deleteEmployeeById(employee, id);
	}
}
