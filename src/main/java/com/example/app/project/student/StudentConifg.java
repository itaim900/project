package com.example.app.project.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConifg {

    @Bean
    CommandLineRunner runner(StudentRepository repository) {
        return args -> {
            Student abc = new Student(
                    1L,
                    "abc",
                    21,
                    "abc@gmail.com"
            );
            Student def = new Student(
                    2L,
                    "def",
                    24,
                    "def@gmail.com"
            );
            repository.saveAll(List.of(abc, def));
        };
    }
}
