package com.aman.vehicleManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aman.vehicleManagement.Entity.VehicleDetail;
@Repository
public interface VehicleDetailsDao extends JpaRepository<VehicleDetail,String>{

	
	
}
