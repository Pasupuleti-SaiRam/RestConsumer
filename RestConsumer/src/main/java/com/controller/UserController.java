package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.responsebinding.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping(value="/getusers")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> allUsers = service.getAllUsers();
		return new ResponseEntity<>(allUsers,HttpStatus.OK);
	}
	@GetMapping("/hello")
	public String msg() {
		return "hello";
		
	}

}
