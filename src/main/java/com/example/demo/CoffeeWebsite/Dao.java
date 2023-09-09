package com.example.demo.CoffeeWebsite;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository
public class Dao implements DataAccess{


    @Override
    public List<User> Links() {
        return Arrays.asList(
                new User("Osuoha Nnamdi","emmaadams2002@gmail.com","76467906","jfjsafbfb")
        );
    }
}
