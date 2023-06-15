package com.aman.vehicleManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.vehicleManagement.Entity.VehicleType;
import com.aman.vehicleManagement.Service.VehicleTypesService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleTypesController {
	
	@Autowired
	private VehicleTypesService vehicleTypesService;
	
	@GetMapping("/vehicletypes")
	public List<VehicleType> getAllVehicleTypes(){
		return vehicleTypesService.getAllVehicleTypes();
	}
	
	
}
