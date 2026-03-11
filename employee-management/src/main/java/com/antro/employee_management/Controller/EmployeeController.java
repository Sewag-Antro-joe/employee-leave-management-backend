package com.antro.employee_management.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antro.employee_management.Service.EmployeeService;
import com.antro.employee_management.entity.Employe;

@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	
	
	@PostMapping
	public Employe createEmployee(@RequestBody Employe employee) {
		return employeeService.createEmployee(employee);
	}
	@GetMapping
	public List<Employe> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	@GetMapping("/{id}")
	public Employe getEmployeeById(@PathVariable UUID id) {
		return employeeService.getEmployeeById(id);
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable UUID id) {
		employeeService.deleteEmployee(id);
	}
	public List<Employe> getByDepartment(@PathVariable String dept){
		
		return employeeService.findByDepartment(dept);
	}
	
	
}
