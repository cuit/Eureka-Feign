package com.example.Eurekacustomeruser.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.JsonNode;

@FeignClient(value="provider-user")
public interface UserService {

	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	JsonNode getUserById(@PathVariable("id")int id);
}
