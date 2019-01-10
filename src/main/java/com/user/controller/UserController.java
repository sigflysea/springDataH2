package com.user.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/users")
public class UserController {
//	@Autowired
//	private UserRepoCrud userRepo;

	@GetMapping(value = "/allb")

	public String findAll(){
		return "Spring 2.10 has issues!";
	}
/*	
	@GetMapping("/{name}")
	public Users findByName(@PathVariable final String name) {
		return userRepo.findByName(name);
	}
	@PostMapping("/load")
	public Users load(@RequestBody final Users users) {
		userRepo.save(users);
		return userRepo.findByName(users.getName());
	}*/
}
