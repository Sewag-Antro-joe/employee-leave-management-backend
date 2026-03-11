package com.antro.employee_management.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antro.employee_management.entity.LeaveRequestEntity;

@Repository
public interface LeaveRepository extends JpaRepository <LeaveRequestEntity,UUID> {

}
