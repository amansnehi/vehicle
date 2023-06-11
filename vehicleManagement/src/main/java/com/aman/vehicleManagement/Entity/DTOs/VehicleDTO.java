package com.aman.vehicleManagement.Entity.DTOs;



import jakarta.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import com.aman.vehicleManagement.Entity.VehicleType;

public class VehicleDTO {
    @NotNull
    @Size(max = 10)
    @Id
    @Pattern(regexp = "^\\d{10}$", message = "Vehicle RegistrationNo must be of 10 digits")
    private String RegistrationNo;

    @Min(value = 0)
    private int BelongsToUserId;

    @Min(value = 0)
    @ManyToOne
    @JoinColumn(name = "VehicleTypeId", referencedColumnName = "ID")
    private VehicleType VehicleType;

    @NotNull
    @Size(max = 10)
    @Pattern(regexp = "^(pending|approved|rejected)$", message = "notvalid")
    private String InspectionStatus;

    @Size(max = 10)
    private String RTOName;

    @NotNull
    @Future
    private Date RegistrationDate;

    @NotNull
    @Future
    private Date RegistrationExpiresOn;

    @Size(max = 50)
    private String InsuranceCompanyName;

    @Size(max = 10)
    private String InsuranceNo;

    @NotNull
    @Future
    private Date InsurancedOn;

    @NotNull
    @Future
    private Date InsuranceExpiresOn;

    @Min(value = 0)
    private int PUCCertificateNo;

    @NotNull
    @Future
    private Date PUCIssuedOn;

    @NotNull
    @Future
    private Date PUCValidUntil;

    // Getters and setters

    public String getRegistrationNo() {
        return RegistrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        RegistrationNo = registrationNo;
    }

    public int getBelongsToUserId() {
        return BelongsToUserId;
    }

    public void setBelongsToUserId(int belongsToUserId) {
        BelongsToUserId = belongsToUserId;
    }

    public VehicleType getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        VehicleType = vehicleType;
    }

    public String getInspectionStatus() {
        return InspectionStatus;
    }

    public void setInspectionStatus(String inspectionStatus) {
        InspectionStatus = inspectionStatus;
    }

    public String getRTOName() {
        return RTOName;
    }

    public void setRTOName(String RTOName) {
        this.RTOName = RTOName;
    }

    public Date getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        RegistrationDate = registrationDate;
    }

    public Date getRegistrationExpiresOn() {
        return RegistrationExpiresOn;
    }

    public void setRegistrationExpiresOn(Date registrationExpiresOn) {
        RegistrationExpiresOn = registrationExpiresOn;
    }

    public String getInsuranceCompanyName() {
        return InsuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        InsuranceCompanyName = insuranceCompanyName;
    }

    public String getInsuranceNo() {
        return InsuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        InsuranceNo = insuranceNo;
    }

    public Date getInsurancedOn() {
        return InsurancedOn;
    }

    public void setInsurancedOn(Date insurancedOn) {
        InsurancedOn = insurancedOn;
    }

    public Date getInsuranceExpiresOn() {
        return InsuranceExpiresOn;
    }

    public void setInsuranceExpiresOn(Date insuranceExpiresOn) {
        InsuranceExpiresOn = insuranceExpiresOn;
    }

    public int getPUCCertificateNo() {
        return PUCCertificateNo;
    }

    public void setPUCCertificateNo(int PUCCertificateNo) {
        this.PUCCertificateNo = PUCCertificateNo;
    }

    public Date getPUCIssuedOn() {
        return PUCIssuedOn;
    }

    public void setPUCIssuedOn(Date PUCIssuedOn) {
        this.PUCIssuedOn = PUCIssuedOn;
    }

    public Date getPUCValidUntil() {
        return PUCValidUntil;
    }

    public void setPUCValidUntil(Date PUCValidUntil) {
        this.PUCValidUntil = PUCValidUntil;
    }
}

