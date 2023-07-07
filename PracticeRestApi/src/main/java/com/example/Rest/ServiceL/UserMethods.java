package com.example.Rest.ServiceL;

import java.util.List;

import com.example.Rest.Model.User;

public interface UserMethods {

	public List<User> getUser();
	public User singleUser(int id);
	public User addUser(User user);
	public List <User> updateUser(int id);
	public User deleteUser(int id);
}
