package com.example.hackathon_1;

import org.springframework.boot.SpringApplication;

public class TestHackathon1Application {

	public static void main(String[] args) {
		SpringApplication.from(Hackathon1Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
