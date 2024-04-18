package com.craft.webService.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.craft.webService.Model.Users;



@Service
public class UserServiceImplement implements UserService{
	
	
	List<Users>list = new ArrayList<>();

	@Override
	public List<Users> viewuser() {
		
		return list;
	}

	@Override
	public Users adduser(Users users) {

		list.add(users);
		return users;
	}

	@Override
	public Users findbyId(int id) {


		for (Users users : list) {
			
			if(users.getId()==id) {
				
				return users;
			}
		}
		return null;
	}

	@Override
	public Users updateUserById(int id, Users users) {


		for (Users users1 : list) {
			
			if(users1.getId()==id) {
				
				users1.setPassword(users.getPassword());
				users1.setUsername(users.getUsername());
				
				return users1;
				
			}
			
		}
		return null;
	}

	@Override
	public String deleteUserByid(int id) {


		for (Users users : list) {
			
			if(users.getId()==id) {
				
				list.remove(users);
				
				return "user is deleted";
			}
			
		}
		return "user is not found";
	}

}
