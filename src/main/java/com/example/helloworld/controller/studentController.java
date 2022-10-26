package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class studentController {


    @GetMapping Mapping("/home")
    public String index(){
        return "home";
    }
}
