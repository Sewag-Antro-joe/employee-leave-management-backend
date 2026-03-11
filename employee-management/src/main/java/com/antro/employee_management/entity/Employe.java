package com.antro.employee_management.entity;



	import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="Employee_Table")
	public class Employe {
	   
	    @GeneratedValue
	    @Id
		private UUID id;
		private String name;
		private String email;
		 private String password;
		 private String role;
		 private String department;
		 private int salary;
		 public UUID getId() {
			 return id;
		 }
		 public void setId(UUID id) {
			 this.id = id;
		 }
		 public String getName() {
			 return name;
		 }
		 public void setName(String name) {
			 this.name = name;
		 }
		 public String getEmail() {
			 return email;
		 }
		 public void setEmail(String email) {
			 this.email = email;
		 }
		 public String getPassword() {
			 return password;
		 }
		 public void setPassword(String password) {
			 this.password = password;
		 }
		 public String getRole() {
			 return role;
		 }
		 public void setRole(String role) {
			 this.role = role;
		 }
		 public String getDepartment() {
			 return department;
		 }
		 public void setDepartment(String department) {
			 this.department = department;
		 }
		 public int getSalary() {
			 return salary;
		 }
		 public void setSalary(int salary) {
			 this.salary = salary;
		 }
		
		
	}


