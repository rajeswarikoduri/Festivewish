package com.festive.controller;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.festive.DTO.AllcategoryDTO;
import com.festive.DTO.HomepageDTO;
import com.festive.DTO.ImagesDTO;
import com.festive.model.Images;
import com.festive.service.FestiveService;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/") 
@Api(value="FestiveWish", description="ApiOperations pertaining to FestiveWish")
public class FestiveWishController {
	private static final Long CategoryId= null;
	@Autowired
	FestiveService festiveservice;
	
	@ApiOperation(value = "View a list of Category", response = HomepageDTO.class)
	@RequestMapping(value = "allcategorylist", method= RequestMethod.GET,produces = "application/json")	
	public ResponseEntity<HomepageDTO> getallCategoriesList() {
		List<AllcategoryDTO> allcategory=festiveservice.getAllCategories();
		HomepageDTO homePageDTO =  new HomepageDTO();
		homePageDTO.setAllcategories(allcategory);
		return new ResponseEntity<HomepageDTO>(homePageDTO, HttpStatus.OK);
	
	}  
	@ApiOperation(value = "View a list of  images", response =ImagesDTO .class,responseContainer = "List")
	@RequestMapping(value = "allimagelist", method= RequestMethod.GET,produces = "application/json")	
	public ResponseEntity<List<ImagesDTO>> getImagesList(@RequestParam("CategoryId") Long CategoryId) {

		List<ImagesDTO> Images = festiveservice.getImageList(CategoryId);

		return new ResponseEntity <List<ImagesDTO>> (Images, HttpStatus.OK);
	}
	@ApiOperation(value = "find image by id", response = Images.class)
	@RequestMapping(value = "findimageById", method= RequestMethod.GET,produces = "application/json")	
	public ResponseEntity<Images> findProductById(@RequestParam("id") Long imageId) {
		
	Images item = festiveservice.findImageById(imageId);

		return new ResponseEntity<Images>(item, HttpStatus.OK);
	}
}
