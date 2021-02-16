package com.BJD.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.BJD.dao.*;
import com.BJD.entity.*;
 
@Service("us")
public class UserService {
	
	@Autowired
	UserDAO uDAO;
 
	public boolean addUser(User u) {
		uDAO.addUser(u);
		return true;
	}
}