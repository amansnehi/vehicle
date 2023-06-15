package com.aman.vehicleManagement.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Vehicle")
public class Vehicle {
    @Id
    @Column(name = "registrationNo")
    private String registrationNo;
    
    

    @Column
    private int belongsToUserId;

    @ManyToOne
    @JoinColumn(name = "vehicleTypeId", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_Vehicle_VehicleType"))
    private VehicleType vehicleType;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "registrationNo", referencedColumnName = "registrationNo", foreignKey = @ForeignKey(name = "FK_Vehicle_registrationNo"))
    private VehicleDetail vehicleDetails;
    
	public VehicleDetail getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetail vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public Integer getInspectedByUserId() {
		return inspectedByUserId;
	}

	public void setInspectedByUserId(Integer inspectedByUserId) {
		this.inspectedByUserId = inspectedByUserId;
	}

	@Override
	public String toString() {
		return "Vehicle [registrationNo=" + registrationNo + ", vehicleDetails=" + vehicleDetails + ", belongsToUserId="
				+ belongsToUserId + ", vehicleType=" + vehicleType + ", inspectionStatus=" + inspectionStatus
				+ ", inspectedByUserId=" + inspectedByUserId + ", inspectedOn=" + inspectedOn + "]";
	}

	@Column(length = 10)
    private String inspectionStatus;

    @Column
    private Integer inspectedByUserId;

    @Column
    private Date inspectedOn;

    // Getters and setters

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public int getBelongsToUserId() {
        return belongsToUserId;
    }

    public void setBelongsToUserId(int belongsToUserId) {
        this.belongsToUserId = belongsToUserId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getInspectionStatus() {
        return inspectionStatus;
    }

    public void setInspectionStatus(String inspectionStatus) {
        this.inspectionStatus = inspectionStatus;
    }

    public Integer getInspectionByUserId() {
        return inspectedByUserId;
    }

    public void setInspectionByUserId(Integer inspectionByUserId) {
        this.inspectedByUserId = inspectionByUserId;
    }

    public Date getInspectedOn() {
        return inspectedOn;
    }

    public void setInspectedOn(Date inspectedOn) {
        this.inspectedOn = inspectedOn;
    }
}

