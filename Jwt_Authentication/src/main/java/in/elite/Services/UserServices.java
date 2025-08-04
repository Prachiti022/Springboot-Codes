package in.elite.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import in.elite.Models.User;

@Service
public class UserServices{
	
	private List<User> store=new ArrayList<>();
	
	private UserServices() {
		store.add(new User(UUID.randomUUID().toString(),"Uma","uma@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"prachiti","prachit@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"sanchita","sanchita@gmail.com"));
	}
	
	public List<User> getUser(){
		return this.store;
	}
}