package com.antro.employee_management.entity;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Leave_Request_Table")
public class LeaveRequestEntity {
	@Id
	@GeneratedValue
	private UUID id;
	private UUID EmployeeId;
	private String leaveType;
	private String reason;
	private Date StartDate;
	private Date EndDate;
	private String status;

}
