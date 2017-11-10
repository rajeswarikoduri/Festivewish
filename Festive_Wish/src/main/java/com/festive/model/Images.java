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
@Table(name="Images")
public class Images {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "AutoIncremented ImageId")
	private Long imageId;

	
	@Column(name = "CategoryId", nullable = false)
	@ApiModelProperty(notes = " CategoryId")
	private Long CategoryId;
	
	
	
	@Column(name = "ImageUrl", nullable = false)
	@ApiModelProperty(notes = " ImageUrl")
	private String ImageUrl;

	@Column(name = "isAvailable", nullable = false)
	@ApiModelProperty(notes = "Is Available")
	private Boolean isAvailable;
	
	@Column(name = "createdDate", nullable = false)
	@ApiModelProperty(notes = "Created Date")
	private Timestamp createdDate;
	
	@Column(name = "modifiedDate", nullable = false)
	@ApiModelProperty(notes = "Modified Date")
	private Timestamp modifiedDate;

	
	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}


	public Long getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(Long CategoryId) {
		this.CategoryId = CategoryId;
	}

	

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.ImageUrl = imageUrl;
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



}
