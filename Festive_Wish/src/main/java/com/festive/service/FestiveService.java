package com.festive.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.festive.DTO.AllcategoryDTO;
import com.festive.DTO.ImagesDTO;
import com.festive.model.Images;


@Service
public interface FestiveService {
	List<AllcategoryDTO> getAllCategories();

	List<ImagesDTO> getImageList(Long categoryid);
	public Images findImageById(Long imageId);
	
}
