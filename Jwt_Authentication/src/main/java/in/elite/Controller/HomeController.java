package in.elite.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.elite.Services.UserServices;

@RestController
@RequestMapping("/home")
public class HomeController{
	
	@Autowired
	private UserServices userService;
	
	@GetMapping("/user")
	public List<in.elite.Models.User> getUser(){
		
		System.out.println("Getting user");
		return this.userService.getUser();
	}
}