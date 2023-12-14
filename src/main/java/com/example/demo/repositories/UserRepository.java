package com.example.demo.repositories;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Repository
public class UserRepository {
	public User findUserByEmail(String email) {
		User user = new User(email, "123456");
		user.setFirstName("FirstName");
		user.setLastName("LastName");
		return user;
	}
}
