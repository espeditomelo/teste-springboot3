package com.vinciano.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vinciano.course.entities.User;
import com.vinciano.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "João Silva", "jsilva@gmail.com", "81989855545", "123456");
		User u2 = new User(null, "Maria Silva", "msilva@gmail.com", "81988985222", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
}
