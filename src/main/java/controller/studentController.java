package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class studentController {
    @RequestMapping("/")
    public String index(Model model){
        return "Greetings from Spring Boot!";
    }
}
