package com.festive.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="Config")
public class Config {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "AutoIncremented ImageId")
	private int ConfigId;

	
	@Column(name = "Configurl", nullable = false)
	@ApiModelProperty(notes = " Configurl")
	private String Configurl;
	
	
	
	@Column(name = "Configdescription", nullable = false)
	@ApiModelProperty(notes = " Configdescription")
	private String Configdescription;

	public int getConfigId() {
		return ConfigId;
	}

	public void setConfigId(int configId) {
		ConfigId = configId;
	}

	public String getConfigurl() {
		return Configurl;
	}

	public void setConfigurl(String configurl) {
		Configurl = configurl;
	}

	public String getConfigdescription() {
		return Configdescription;
	}

	public void setConfigdescription(String configdescription) {
		Configdescription = configdescription;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "isAvailable", nullable = false)
	@ApiModelProperty(notes = "Is Available")
	private Boolean isAvailable;
	
	@Column(name = "createdDate", nullable = false)
	@ApiModelProperty(notes = "Created Date")
	private Timestamp createdDate;
	
	@Column(name = "modifiedDate", nullable = false)
	@ApiModelProperty(notes = "Modified Date")
	private Timestamp modifiedDate;
}
