package com.aman.vehicleManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aman.vehicleManagement.Entity.VehicleType;
@Repository
public interface VehicleTypesDao extends JpaRepository<VehicleType,Integer>{
	
	
}
