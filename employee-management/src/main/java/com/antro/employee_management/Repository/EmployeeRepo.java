package com.antro.employee_management.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antro.employee_management.entity.Employe;

@Repository
public interface EmployeeRepo extends JpaRepository<Employe,UUID>{
	List<Employe> findByDepartment(String department);
}
