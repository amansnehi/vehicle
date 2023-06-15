package com.aman.vehicleManagement.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "VehicleType")
public class VehicleType {
    @Id
	
    private int ID;
   

    @Column(length = 10)
    private String Type;

    @Column
    private int MaxPassengersAllowed;

    @Column
    private int FarePerKM;

    // Getters and setters

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getMaxPassengersAllowed() {
        return MaxPassengersAllowed;
    }

    public void setMaxPassengersAllowed(int maxPassengersAllowed) {
        MaxPassengersAllowed = maxPassengersAllowed;
    }

    public int getFarePerKM() {
        return FarePerKM;
    }

    public void setFarePerKM(int farePerKM) {
        FarePerKM = farePerKM;
    }
}

