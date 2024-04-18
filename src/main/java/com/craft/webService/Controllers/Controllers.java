package com.craft.webService.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.craft.webService.Model.Users;
import com.craft.webService.Service.UserService;

@RestController
@RequestMapping("/api/v2")
public class Controllers {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/allusers")
	public List<Users> allusersMethod(){
		
		return userService.viewuser();
	}
	
//	@PostMapping("/adduser")
//	public String adduserMethod(@RequestBody Users users) {
//		
//		list.add(users);
//		
//		return "user is added";
//		
//	}
	
	@PostMapping("/adduser")
	public Users adduserMethod(@RequestBody Users users) {
		
		
		
		return userService.adduser(users);
	}
	
	@GetMapping("/finduserBy/{id}")
	public Users findbyidMethod(@PathVariable("id") int id) {
		
		
		return userService.findbyId(id);
	}
	
	@PutMapping("/updateuser")
	public Users updatebyIdMethod(@RequestParam(name = "id", required = true) int id , @RequestBody Users users) {
		
		
		return userService.updateUserById(id, users);
	}
	
	@DeleteMapping("/deletebyID/{id}")
	public String deletebyIdMethod(@PathVariable("id") int id) {
		
		return userService.deleteUserByid(id);
		
	}
	

}
