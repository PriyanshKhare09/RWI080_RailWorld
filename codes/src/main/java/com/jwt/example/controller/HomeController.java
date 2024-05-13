package com.jwt.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.models.User;
import com.jwt.example.service.Userservice;

@RestController
@RequestMapping("/homes")
public class HomeController {
	
	@Autowired
	private Userservice userservice;
	// http://localhost:8080/home/user
	@GetMapping("/users")
	public List<User> getUser() 
	{
		System.out.println("Getting Users");
		return  this.userservice.getUser();
	}

}
