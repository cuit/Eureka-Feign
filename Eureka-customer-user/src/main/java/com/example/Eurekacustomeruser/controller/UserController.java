package com.example.Eurekacustomeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Eurekacustomeruser.service.UserService;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public JsonNode getUser(@PathVariable("id")Integer id) {
		JsonNode jsonNode = userService.getUserById(id);
		return jsonNode;
	}
	
}
