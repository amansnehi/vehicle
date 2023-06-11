package com.aman.vehicleManagement.Entity.DTOs;


import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;
import com.aman.vehicleManagement.Entity.VehicleType;

public class RegisterVehicleDTO {
    @Column(length = 10)
    @NotNull
    private String RegistrationNo;

    @Column
    private int BelongsToUserId;

    @ManyToOne
    @JoinColumn(name = "VehicleTypeId", referencedColumnName = "ID")
    private VehicleType VehicleType;

    @Column(length = 10)
    @Pattern(regexp = "^(pending|approved|rejected)$", message = "notvalid")
    private String InspectionStatus;

    @Column(length = 10)
    private String RTOName;

    private Date RegistrationDate;

    private Date RegistrationExpiresOn;

    @Column(length = 50)
    private String InsuranceCompanyName;

    @Column(length = 10)
    private String InsuranceNo;

    private Date InsurancedOn;

    private Date InsuranceExpiresOn;

    private int PUCCertificateNo;

    private Date PUCIssuedOn;

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

