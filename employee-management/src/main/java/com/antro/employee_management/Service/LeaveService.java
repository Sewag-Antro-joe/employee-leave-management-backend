package com.antro.employee_management.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.antro.employee_management.Repository.LeaveRepository;
import com.antro.employee_management.entity.LeaveRequestEntity;

@Service
public class LeaveService {

	public final LeaveRepository LeaveRepo;
	
	public LeaveService(LeaveRepository LeaveRepo) {
		this.LeaveRepo=LeaveRepo;
		
	}
	
	public LeaveRequestEntity applyLeave(LeaveRequestEntity leaveRequest) {
		leaveRequest.setStatus("PENDING");
		return LeaveRepo.save(leaveRequest);
	}
		public Optional<LeaveRequestEntity> getEmployeeLeaves(UUID id){
			return LeaveRepo.findById(id);
		}
		
		public List<LeaveRequestEntity> getAllLeaves(){
			return LeaveRepo.findAll();
		}
		
		public LeaveRequestEntity ApproveLeave(UUID id) {
			
		LeaveRequestEntity leave=LeaveRepo.findById(id).orElse(null);
		if(leave !=null) {
			leave.setStatus("APPROVED");
					return LeaveRepo.save(leave);
		} return null;
		}
		
		public LeaveRequestEntity RejectLeave(UUID id) {
			LeaveRequestEntity leave=LeaveRepo.findById(id).orElse(null);
			if(leave !=null) {
				leave.setStatus("REJECTED");
				return LeaveRepo.save(leave);
			}
			return null;
	        }
	
	
}
