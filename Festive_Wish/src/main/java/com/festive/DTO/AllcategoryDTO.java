package com.festive.DTO;

public class AllcategoryDTO {
	private String categoryName;
	private String imageUrl;
	private Long PositionOrder;	
	private Boolean isAvailable;
	private Long CategoryId;
	
	
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
	public Long getPositionOrder() {
		return PositionOrder;
	}
	public void setPositionOrder(Long positionOrder) {
		PositionOrder = positionOrder;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
}
