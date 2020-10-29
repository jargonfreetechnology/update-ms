package com.bservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdao.IupdateDao;
import com.domain.User;

@Service
@Transactional
public class UpdateServiceImpl implements IupdateService {
	
	@Autowired
	private IupdateDao userDaoImpl;	

	/* Update a record */
	@Override
	public User updateUser(User user) {
		user = userDaoImpl.save(user);
		System.out.println("Record updated!!!");
		return user;
	}

	@Override
	public String toString() {
		return "UpdateServiceImpl";
	}

}