package com.programmingonestop.retrofithttpclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programmingonestop.retrofithttpclient.retrofitmodel.Post;
import com.programmingonestop.retrofithttpclient.service.RandomPostService;

/*
 * 
 * This is the main controller class that the user can use to
 * interact with the api
 */
@RestController
public class MainController 
{

	@Autowired
	RandomPostService ps;
	@GetMapping("/")
	public List<Post> posts() 
	{
		List<Post>posts=ps.getRandomResponse();
		return posts;
	}
}
