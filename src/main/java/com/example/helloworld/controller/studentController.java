package com.example.helloworld.controller;

import com.example.helloworld.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;


@Controller
public class studentController {

    @GetMapping ("/home")
    public String index(Model model){
        Student student = new Student(1L,"meriam","meriam@gmail.com", LocalDate.of(2000,12,03),25);
        model.addAttribute("Student",student);
        return "home";
    }
}
