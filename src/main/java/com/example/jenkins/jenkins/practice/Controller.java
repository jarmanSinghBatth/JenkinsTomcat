package com.example.jenkins.jenkins.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello/{name}")
    public String message(@PathVariable String name){
        return "Hello " + name + ", Welcome to our hotel or resort";
    }
}
