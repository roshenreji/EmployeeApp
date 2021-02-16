package com.mindtree.employeeApplication.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.employeeApplication.dao.EmployeeRepository;
import com.mindtree.employeeApplication.entity.Employee;
import com.mindtree.employeeApplication.exceptions.ResourceNotFoundException;
import com.mindtree.employeeApplication.service.EmployeeApplicationService;

@Service
public class EmployeeApplicationImpl implements EmployeeApplicationService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	
	public Employee getEmployeeById(int id) {
		Employee employee=employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id Not Found"));
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employee=new ArrayList<Employee>();
		employee=employeeRepository.findAll();
		return employee;
	}

	@Override
	public Employee addNewEmployee(Employee employee) {
		Employee newEmployee=employeeRepository.save(employee);
		return newEmployee;
	}

	@Override
	public Employee deleteEmployeeById(Employee employee, int id) {
		employeeRepository.deleteById(id);
		return employee;
	}

}
