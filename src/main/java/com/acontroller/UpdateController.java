package com.acontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bservice.IupdateService;
import com.domain.User;

@RestController
public class UpdateController {
	
	@Autowired
	private IupdateService updateService;

	@PostMapping("/update")
	public User update(@RequestBody User user) {
		
		updateService.updateUser(user);

		return user;

	}

}