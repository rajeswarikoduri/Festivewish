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
	@Table(name="AllCategory")
	public class Allcategories {
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@ApiModelProperty(notes = "AutoIncremented CategoryId")
		private Long CategoryId;

		@Column(name = "categoryName", nullable = false)
		@ApiModelProperty(notes = "Category Name")
		private String categoryName;
		
		@Column(name = "imageUrl", nullable = false)
		@ApiModelProperty(notes = "Image Url")
		private String imageUrl;
	
		@Column(name = "PositionOrder", nullable = false)
		@ApiModelProperty(notes = " PositionOrder")
		private Long PositionOrder;
		@Column(name = "isAvailable", nullable = false)
		@ApiModelProperty(notes = " isAvailable")
		private Boolean isAvailable;
		@Column(name = "createdDate", nullable = false)
		@ApiModelProperty(notes = "Created Date")
		private Timestamp createdDate;
		
		@Column(name = "modifiedDate", nullable = false)
		@ApiModelProperty(notes = "Modified Date")
		private Timestamp modifiedDate;

		public Long getCategoryId() {
			return CategoryId;
		}

		public void setCategoryId(Long CategoryId) {
			this.CategoryId = CategoryId;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public Boolean getisAvailable() {
			return isAvailable;
		}

		public void setisAvailable(Boolean isAvailable) {
			this.isAvailable = isAvailable;
		}

		public Long getPositionOrder() {
			return PositionOrder;
		}

		public void setPostionOrder(Long postionOrder) {
			PositionOrder = postionOrder;
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
