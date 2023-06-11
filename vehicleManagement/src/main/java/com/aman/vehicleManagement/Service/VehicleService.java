package com.aman.vehicleManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aman.vehicleManagement.Entity.Vehicle;
import com.aman.vehicleManagement.Repo.VehicleDao;

@Service
public class VehicleService {
	@Autowired 
	private VehicleDao vehicleRepository;
	
	public Vehicle addVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);	
	}
}
