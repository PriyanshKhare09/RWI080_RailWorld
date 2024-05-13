package com.jwt.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.models.User;

@Service
public class Userservice {
	private List<User> store = new ArrayList<>();

	public Userservice() {

		store.add(new User(UUID.randomUUID().toString(), "priyanshkhare", "G@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "vishu", "v@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "sonam", "s@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "rahul", "R@gmail.com"));
	}

	public List<User> getUser() {
		return this.store;
	}

}
