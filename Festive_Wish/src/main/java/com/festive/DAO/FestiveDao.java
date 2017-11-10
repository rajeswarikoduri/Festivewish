package com.festive.DAO;

import java.util.List;



import com.festive.model.Allcategories;
import com.festive.model.Config;
import com.festive.model.Images;


public interface FestiveDao {
	
	List<Allcategories> getFestiveCategories();

	List<Images> getimageList(Long festivecategoryid);
	List<Config> getimageconfig(int ConfigId);
	List<Config> getcategoryconfig(int ConfigId);
	
	Images findimageById(Long imageId);
}
