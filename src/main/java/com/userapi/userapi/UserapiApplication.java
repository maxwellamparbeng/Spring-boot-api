package com.userapi.userapi;
import com.userapi.userapi.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserapiApplication {


	@Autowired
	userService userservice;

	public static void main(String[] args) {
		SpringApplication.run(UserapiApplication.class, args);
	}

	@Bean
	public userService userservice(){

		return new userService();
	}

}
