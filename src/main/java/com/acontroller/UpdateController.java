package com.acontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bservice.IupdateService;
import com.domain.User;
import com.proxy.ReaderProxy;

@RestController
public class UpdateController {
	
	@Autowired
	private IupdateService updateService;

    @Autowired
    private ReaderProxy readerProxy;

	@PostMapping("/update")
	public List<User> update(@RequestBody User user) {
		
		updateService.updateUser(user);

		List<User> userList = readerProxy.read();

		return userList;

	}

}