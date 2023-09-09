package com.example.demo.CoffeeWebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Services {

    private final Dao dao;

    @Autowired
    public Services(Dao dao) {
        this.dao = dao;
    }

    List <User> Links(){

        return dao.Links();
    }
}
