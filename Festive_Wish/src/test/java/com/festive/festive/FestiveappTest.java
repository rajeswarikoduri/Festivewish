package com.festive.festive;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.festive.festivewish.FestiveWishApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={FestiveWishApplication.class})
public class FestiveappTest  {

	@Test
	public void contextLoads() {
	}

}