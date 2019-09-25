package com.example.demo.Restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.userServices;
import com.example.model.User;

@org.springframework.web.bind.annotation.RestController
public class RestController {
 
	@Autowired
	private userServices userservices;
	@GetMapping("/hello")
	public String hello() {
	 return "This is Home Page";
 }
	@GetMapping("/usersaved")
	public String saveuser(@RequestParam String username,@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age,@RequestParam String password) {
		User user=new User(username,firstname,lastname,age,password);
		userservices.saveMyUser(user);
		return "user is saved successfully";
	}
}
