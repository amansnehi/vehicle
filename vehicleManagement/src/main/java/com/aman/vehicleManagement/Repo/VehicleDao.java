package com.aman.vehicleManagement.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aman.vehicleManagement.Entity.Vehicle;
@Repository
public interface VehicleDao extends JpaRepository<Vehicle,String>{

	List<Vehicle> findAllByBelongsToUserId(int userId);
	
	
}
