package com.example.Rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rest.Model.User;
import com.example.Rest.ServiceL.UserMethodimpl;

@RestController
public class MainController {

	@Autowired 
	private UserMethodimpl userimpl;
	
	@GetMapping("/test")
	public String Test() {
		return "Lets check api work or not";
	}
	
	@GetMapping("/user")
	public List<User> getUser(){
		return this.userimpl.getUser();
	}
	
	@GetMapping("/user/{uId}")
	public User singleUser(@PathVariable String uId) {
		return this.userimpl.singleUser(Integer.parseInt(uId));
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		
		return this.userimpl.addUser(user);
	}
	
	@PutMapping("/user/{uId}")
	public List <User> updateUser(@PathVariable int uId){
		return this.userimpl.updateUser(uId);
	}
	
	@DeleteMapping("/user/{uId}")
	public User deleteUser(@PathVariable int uId) {
		return this.userimpl.deleteUser(uId);
	}
}
