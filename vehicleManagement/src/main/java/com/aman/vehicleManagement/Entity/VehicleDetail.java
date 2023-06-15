package com.aman.vehicleManagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import javax.validation.constraints.*;
import javax.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name = "VehicleDetail")
public class VehicleDetail {
	@Id
	private String registrationNo;
	
    @Override
	public String toString() {
		return "VehicleDetail [registrationNo=" + registrationNo + ", RTOName=" + RTOName + ", registrationDate="
				+ registrationDate + ", registrationExpiresOn=" + registrationExpiresOn + ", insuranceCompanyName="
				+ insuranceCompanyName + ", insuranceNo=" + insuranceNo + ", insurancedOn=" + insurancedOn
				+ ", insuranceExpiresOn=" + insuranceExpiresOn + ", insuranceCertificateDOCURL="
				+ insuranceCertificateDOCURL + ", PUCCertificateNo=" + PUCCertificateNo + ", PUCIssuedOn=" + PUCIssuedOn
				+ ", PUCValidUntil=" + PUCValidUntil + ", PUCDOCURL=" + PUCDOCURL + "]";
	}

	@Column(length = 10)
    private String RTOName;

    @Column
    @NotNull
    private Date registrationDate;

    @Column
    @NotNull
    @Future
    private Date registrationExpiresOn;

    @Column(length = 50)
    private String insuranceCompanyName;

    @Column(length = 10)
    private String insuranceNo;

    @Column
    @NotNull
    private Date insurancedOn;

    @Column
    @NotNull
    @Future
    private Date insuranceExpiresOn;

    
    @Column
    private String insuranceCertificateDOCURL;
    
    @Column
    @Min(value = 0)
    private int PUCCertificateNo;

    @Column
    @NotNull
    private Date PUCIssuedOn;

    @Column
    @NotNull
    @Future
    private Date PUCValidUntil;

    private String PUCDOCURL;
    // Getters and setters

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getRTOName() {
        return RTOName;
    }

    public void setRTOName(String RTOName) {
        this.RTOName = RTOName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getRegistrationExpiresOn() {
        return registrationExpiresOn;
    }

    public void setRegistrationExpiresOn(Date registrationExpiresOn) {
        this.registrationExpiresOn = registrationExpiresOn;
    }

    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public Date getInsurancedOn() {
        return insurancedOn;
    }

    public void setInsurancedOn(Date insurancedOn) {
        this.insurancedOn = insurancedOn;
    }

    public Date getInsuranceExpiresOn() {
        return insuranceExpiresOn;
    }

    public void setInsuranceExpiresOn(Date insuranceExpiresOn) {
        this.insuranceExpiresOn = insuranceExpiresOn;
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

	public String getInsuranceCertificateDOCURL() {
		return insuranceCertificateDOCURL;
	}

	public void setInsuranceCertificateDOCURL(String insuranceCertificateDOCURL) {
		this.insuranceCertificateDOCURL = insuranceCertificateDOCURL;
	}

	public String getPUCDOCURL() {
		return PUCDOCURL;
	}

	public void setPUCDOCURL(String pUCDOCURL) {
		PUCDOCURL = pUCDOCURL;
	}
}

