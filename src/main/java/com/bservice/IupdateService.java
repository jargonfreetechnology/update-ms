package com.bservice;

import org.springframework.stereotype.Service;

import com.domain.User;

@Service
public interface IupdateService {

	/* Update a record */
	public void updateUser(User user);

}