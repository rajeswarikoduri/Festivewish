package com.festive.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.festive.DAO.FestiveDao;
import com.festive.DTO.AllcategoryDTO;
import com.festive.DTO.ImagesDTO;
import com.festive.model.Allcategories;
import com.festive.model.Config;
import com.festive.model.Images;




@Service("festiveservice")
@Transactional

public class FestivewishServiceImpli implements FestiveService {
	@Autowired
	FestiveDao festivedao;
	@Override
	public List<AllcategoryDTO> getAllCategories() {
		// TODO Auto-generated method stub
				List<Allcategories> allCategories = festivedao.getFestiveCategories();
				List<Config> config=festivedao.getcategoryconfig(1);
				
				List<AllcategoryDTO> CategoryDTO = new ArrayList<AllcategoryDTO>();
				
					allCategories.forEach(item->{config.forEach(it->{
					AllcategoryDTO fsCategoryDTO = new AllcategoryDTO();
					String url=(it.getConfigurl()).concat(item.getImageUrl());
					
					fsCategoryDTO.setImageUrl(url);
					fsCategoryDTO.setCategoryId(item.getCategoryId());
					fsCategoryDTO.setCategoryName(item.getCategoryName());
					//fsCategoryDTO.setImageUrl(item.getImageUrl());
					fsCategoryDTO.setPositionOrder(item.getPositionOrder());
					fsCategoryDTO.setIsAvailable(item.getisAvailable());
					CategoryDTO.add(fsCategoryDTO);
				});});
				/*config.forEach(it->{
					AllcategoryDTO DTO = new AllcategoryDTO();
					DTO.setConfigUrl(it.getConfigurl());
					CategoryDTO.add(DTO);
				});*/
				return CategoryDTO;
	}



	@Override
	public List<ImagesDTO> getImageList(Long categoryid) {
		 //TODO Auto-generated method stub
		List<Images> Images = festivedao.getimageList(categoryid);
		List<Config> config=festivedao.getimageconfig(2);
		List<ImagesDTO> ImagesDTO = new ArrayList<ImagesDTO>();
		
		Images.forEach(item->{config.forEach(it->{
			ImagesDTO itemDTO = new ImagesDTO();
			String url1=(it.getConfigurl()).concat(item.getImageUrl());
			
			itemDTO.setCategoryId(item.getCategoryId());
			itemDTO.setImageUrl(url1);
			itemDTO.setImageId(item.getImageId());
			
			
			itemDTO.setIsAvailable(item.getIsAvailable());
			ImagesDTO.add(itemDTO);
		});});
		return ImagesDTO;
	}
	
	public Images findImageById(Long imageId){
		Images image = festivedao.findimageById(imageId);
		return image;
	}
}
