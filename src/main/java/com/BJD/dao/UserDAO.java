package com.BJD.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
	
	@Transactional
	public boolean checkUser(String un, String pw) {
		Session session=factory.getCurrentSession();
		User result = (User) session.createQuery("from User WHERE username = :un AND password = :pw", User.class)
				.setParameter("un", un).setParameter("pw", pw).uniqueResult();
		
		if (result != null) { return true; }
		return false;
	}
}