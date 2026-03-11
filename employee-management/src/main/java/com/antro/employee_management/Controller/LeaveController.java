package com.antro.employee_management.Controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antro.employee_management.Service.LeaveService;
import com.antro.employee_management.entity.LeaveRequestEntity;

@Controller
@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequestMapping("/leave")
public class LeaveController {

	
	private final LeaveService LeaveService;
	
	public LeaveController(LeaveService LeaveService) {
		this.LeaveService=LeaveService;
		
	}
	
	@PostMapping("/apply")
	public LeaveRequestEntity applyLeave(@RequestBody LeaveRequestEntity leaveRequest) {
		return LeaveService.applyLeave(leaveRequest);
	}
	@GetMapping("/employee/{id}")
	public Optional<LeaveRequestEntity> getEmployeeLeave(@PathVariable UUID id){
		return LeaveService.getEmployeeLeaves(id);
	}
	@GetMapping("/all")
	public List<LeaveRequestEntity> getAllLeaves(){
		return LeaveService.getAllLeaves();
		
	}
	@PutMapping("/Approve/{id}")
	public LeaveRequestEntity ApproveLeave(@PathVariable UUID id) {
		return LeaveService.ApproveLeave(id);
	}
	@PutMapping("/Reject/{id}")
	public LeaveRequestEntity RejectLeave(@PathVariable UUID id) {
		return LeaveService.RejectLeave(id);
	}
}
