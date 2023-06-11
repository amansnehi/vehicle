package com.aman.vehicleManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aman.vehicleManagement.Entity.Vehicle;
@Repository
public interface VehicleDao extends JpaRepository<Vehicle,String>{
	
	
}
