package spring.demo.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import spring.demo.first.bean.HelloWorldBean;
import spring.demo.first.bean.Users;
import spring.demo.first.service.UserDAOService;

@RestController
public class HelloWorldController {

	@Autowired
	private UserDAOService user;
	
	@GetMapping(path="/hello-world")  
	public String helloWorld()  
	{  
	return "Hello World";  
	}  
	@GetMapping(path="/hello-world-bean")  
	public HelloWorldBean helloWorldBean()  
	{  
	return new HelloWorldBean("Hello World");  
	}  
	@GetMapping(path="/users") 
	public List<Users> retrieveAllUsers()
	{
		return user.findAll();
	}
	
	@GetMapping(path="/users/{id}") 
	public Users retrieveuser(@PathVariable int id)
	{
		return user.findOne(id);
	}
}

