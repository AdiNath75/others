package com.usermanage.UserManage.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.usermanage.UserManage.model.User;
import com.usermanage.UserManage.properties.AppConfig;
import com.usermanage.UserManage.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private AppConfig appProperties;
	
	@GetMapping("/user")
	public String loadUserForm(Model model) {
		
		User user = new User();
		
		model.addAttribute("user", user);
		
		return "userinfo";
		
	}
	
	@PostMapping("/saveUsers")
	public String saveUser(User user, Model model) {
		
		boolean users = service.save(user);
		
		Map<String, String> messages = appProperties.getMessages();
		
		if(users) {
			model.addAttribute("SUCCESS",messages.get("saveSuccess"));	
		}else {
			model.addAttribute("FAIL",messages.get("saveFail"));
		}
		
		return "userinfo";
	}
	
	@GetMapping("/viewAllUsers")
	public String viewAllUsers(Model model) {
		
		List<User> allUsers = service.getAllUsers();
		model.addAttribute("contact", allUsers);
		return "contact";
	}
	
	
	
	
	
	
	
	
	
	
	

}
