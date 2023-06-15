package com.aman.vehicleManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.vehicleManagement.Entity.Vehicle;
import com.aman.vehicleManagement.Service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping("/addvehicle")
	public String addVehicle(@RequestBody Vehicle vehicle) {
		return (vehicleService.addVehicle(vehicle)).toString();
	}
	
	@GetMapping("/{id}")
	public List<Vehicle> getAllVehicleDetailsByUserId(@PathVariable(name="id") Integer userId){
		return vehicleService.getVehicleDetailsByUserId(userId);
	}
	
	@DeleteMapping("/{registrationNo}")
	public void deleteVehicleDetailsByRegistrationNo(@PathVariable(name="registrationNo") String regNo) {
		vehicleService.deleteVehicleDetailByResigtrationNo(regNo);
	}
	
//	@PostMapping("/approveorreject")
//	public String updateStatus(@RequestBody Vehicle vehicle) {
//		return (vehicleService.addVehicle(vehicle)).toString();
//	}
	
}
