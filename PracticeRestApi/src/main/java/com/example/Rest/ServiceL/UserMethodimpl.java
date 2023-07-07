package com.example.Rest.ServiceL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Rest.Model.User;

@Service
public class UserMethodimpl implements UserMethods{

	public  UserMethodimpl() {

		lst = new ArrayList<User>();
		lst.add(new User(1,"Vinay", "Jadhav"));
		lst.add(new User(2,"Mayur", "Patil"));
		lst.add(new User(3,"Vishal", "Jadhav"));
		lst.add(new User(4,"Tushar", "Pawar"));
	}
	
	List<User> lst;
	@Override
	public List<User> getUser() {
		return lst;
	}
	@Override
	public User singleUser(int id) {
		User user = null;
		for(User user1:lst) {
		if(user1.getId()==id) {
			user = user1;
			break;
		}
		}
		return user;
	}
	@Override
	public List <User> updateUser(int id) {
	
		for(User us :lst) {
			if(us.getId()==id) {
				us.setCity("pune");
				us.setName("Rohan");
				break;
			}
		}
		return  lst;
	}
	@Override
	public User deleteUser(int id) {
		User usr = null;
		for(User us :lst) {
			if(us.getId()==id) {
				usr =us;
				lst.remove(us);
				break;
			}
		}
		
		return usr;
	}
	@Override
	public User addUser(User user) {
		lst.add(user);
		return user;
	}

	
}
