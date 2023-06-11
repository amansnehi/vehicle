package com.aman.vehicleManagement.Entity.DTOs;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class UpdateVehicleDTO {
    @NotNull
    private String RegistrationNo;

    @Pattern(regexp = "^(pending|approved|rejected)$", message = "notvalid")
    private String InspectionStatus;

    private int InspectionByUserId;

    private Date InspectedOn;

    // Getters and setters

    public String getRegistrationNo() {
        return RegistrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        RegistrationNo = registrationNo;
    }

    public String getInspectionStatus() {
        return InspectionStatus;
    }

    public void setInspectionStatus(String inspectionStatus) {
        InspectionStatus = inspectionStatus;
    }

    public int getInspectionByUserId() {
        return InspectionByUserId;
    }

    public void setInspectionByUserId(int inspectionByUserId) {
        InspectionByUserId = inspectionByUserId;
    }

    public Date getInspectedOn() {
        return InspectedOn;
    }

    public void setInspectedOn(Date inspectedOn) {
        InspectedOn = inspectedOn;
    }
}
