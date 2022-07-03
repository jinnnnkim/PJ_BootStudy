package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserInfoRepository;

@RestController
public class TestRestContorller {
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@GetMapping("/user")
	public Iterable<User> getUserList() {
		
		List<User> result = userInfoRepository.findAll();

		
		return userInfoRepository.findAll(); 
		
	}

}
