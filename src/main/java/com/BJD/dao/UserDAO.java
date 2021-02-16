package com.BJD.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.BJD.entity.*;
 
@Repository
public class UserDAO {	
	@Autowired
	SessionFactory factory;
 
	@Transactional
	public boolean addUser(User u) {
		Session session=factory.getCurrentSession();
		session.save(u);
		return true;
	}
}