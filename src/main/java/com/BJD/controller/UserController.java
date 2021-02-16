package com.BJD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
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
