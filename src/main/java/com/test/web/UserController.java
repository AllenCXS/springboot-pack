package com.test.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {


	@GetMapping("/getAllUsers")
	public List<Integer> getAllUsers() {
		List<Integer> allUsers = new ArrayList<>();
		allUsers.add(1);
		allUsers.add(1);
		allUsers.add(1);
		return allUsers;
	}
}
