package com.example.demo.CoffeeWebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controllers {
    @Autowired
    private final Services services;

    public Controllers(Services services) {
        this.services = services;
    }


    @GetMapping("/all")
    public List <User> findAllUser(){
        return services.Links();
    }
}
