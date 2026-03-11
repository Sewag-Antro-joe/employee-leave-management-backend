package com.antro.employee_management.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public class EmployeeDTO {
@NotBlank
private String name;
@Email
private String email;
@NotBlank
private String department;
private String salary;

}
