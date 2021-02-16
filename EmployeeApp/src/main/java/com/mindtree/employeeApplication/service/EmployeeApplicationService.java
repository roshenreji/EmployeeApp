package com.mindtree.employeeApplication.service;

import java.util.List;

import com.mindtree.employeeApplication.entity.Employee;

public interface EmployeeApplicationService {

	Employee getEmployeeById(int id);
	List<Employee>getAllEmployees();
	Employee addNewEmployee(Employee employee);
	Employee deleteEmployeeById(Employee employee,int id);
}
