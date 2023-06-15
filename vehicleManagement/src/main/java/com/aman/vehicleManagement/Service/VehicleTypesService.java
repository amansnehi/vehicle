package com.aman.vehicleManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aman.vehicleManagement.Entity.VehicleType;
import com.aman.vehicleManagement.Repo.VehicleTypesDao;

@Service
public class VehicleTypesService{
	
	@Autowired
	private VehicleTypesDao vehicleTypesDao; 
	
	public List<VehicleType> getAllVehicleTypes(){
		return vehicleTypesDao.findAll();
	}
}
