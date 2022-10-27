package com.example.helloworld;

import com.example.helloworld.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @GetMapping("/")
    public List<Student> index(){
        return List.of(
                new Student(1L,
                        "meriam","meriam@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,03),
                        25)
        );
    }
}
