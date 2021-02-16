package com.mindtree.employeeApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Size(min=2, message="Name should be atleast 2 characters long")
	//@Column(name="Name")
	private String name;
	
	@NotNull
	@Size(min=2, message="Designation should be atleast 2 characters long")
	//@Column(name="Designation")
	private String designation;
	
	@NotNull
	@Size(min=2, message="Department should be atleast 2 characters long")
	//@Column(name="Department")
	private String department;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String designation, String department) {
		super();
		this.name = name;
		this.designation = designation;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
