package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.RegistrationService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class RegistrationController {

	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception {
        String tempEmailId=user.getEmailId();
        if(tempEmailId != null) {
        	User userobj=service.fetchUserByEmailId(tempEmailId);    
        	if(userobj != null) {
        		throw new Exception("User with " +tempEmailId+" is already existing");       
        	}
        }
		User userObj=null;
		userObj=service.saveUser(user);
		return userObj;
	}
	
}
