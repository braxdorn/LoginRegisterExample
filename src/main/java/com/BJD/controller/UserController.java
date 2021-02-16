package com.BJD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import com.BJD.entity.User;
import com.BJD.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService us;
	
	@PostMapping(value="/addUser")
	public String addUser(User user) {
		us.addUser(user);
		
		return "redirect:/index.jsp";
	}
}
