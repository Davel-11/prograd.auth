package com.nebulosa.auth;

import com.nebulosa.auth.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthApplication {

	static UserRepository userRepository;

	AuthApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);

		System.out.println("all is" + userRepository.findAll());

	}

}
