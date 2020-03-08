package com.in28minutes.learning.jpa.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserRepository;

public class UserRepositoryCommandLineRunner implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;


	@Override
	public void run(String... args) throws Exception {
		User user = new User("Sam", "Admin");
		userRepository.save(user);
		logger.info("New User Created {}" , user);
	}

}
