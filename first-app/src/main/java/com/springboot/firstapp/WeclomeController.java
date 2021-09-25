package com.springboot.firstapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeclomeController {

    @GetMapping("")
    public String welcome(){
        return "Hello world from Sping Boot";
    }
}
