package com.festive.DTO;

import java.util.List;

public class HomepageDTO {
List <AllcategoryDTO> Allcategories;

public List<AllcategoryDTO> getAllcategories() {
	return Allcategories;
}

public void setAllcategories(List<AllcategoryDTO> allcategories) {
	Allcategories = allcategories;
}
}
