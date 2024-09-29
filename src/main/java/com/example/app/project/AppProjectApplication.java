package com.example.app.project;

import com.example.app.project.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@SpringBootApplication

public class AppProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppProjectApplication.class, args);

	}

}

