package com.craft.webService.Service;

import java.util.List;

import com.craft.webService.Model.Users;

public interface UserService {
	
	public List<Users> viewuser();
	public Users adduser(Users users);
	public Users findbyId(int id);
	public Users updateUserById(int id, Users users);
	public String deleteUserByid(int id);

}
