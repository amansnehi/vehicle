package com.aman.vehicleManagement.Service;

import java.util.List;

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
	public List<Vehicle> getVehicleDetailsByUserId(int userId){
		return vehicleRepository.findAllByBelongsToUserId(userId);
	}
	
	public void deleteVehicleDetailByResigtrationNo(String regNo) {
		 vehicleRepository.deleteById(regNo);
	}
}
