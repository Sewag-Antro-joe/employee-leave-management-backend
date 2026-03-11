package com.antro.employee_management.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.antro.employee_management.Repository.EmployeeRepo;
import com.antro.employee_management.entity.Employe;
import com.antro.employee_management.exception.ResourceNotFoundException;

@Service
public class EmployeeService {
private final EmployeeRepo EmployeeRepo;

public EmployeeService(EmployeeRepo EmployeeRepo) {
	this.EmployeeRepo = EmployeeRepo;
}

public Employe createEmployee(Employe employee) {
	return EmployeeRepo.save(employee);
}
public List<Employe> getAllEmployee(){
	return EmployeeRepo.findAll();
}
public Employe getEmployeeById(UUID id) {
	return EmployeeRepo.findById(id)
			.orElseThrow(()->new ResourceNotFoundException("Employee not found with id"+id));
}
public void deleteEmployee(UUID id) {
	
	EmployeeRepo.deleteById(id);
}


public List<Employe> findByDepartment(String dept) {
	
	return null;
}

}
