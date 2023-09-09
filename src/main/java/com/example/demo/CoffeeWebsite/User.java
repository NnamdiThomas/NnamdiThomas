package com.example.demo.CoffeeWebsite;

public class User {

    private final String name;
    private final String email;
    private final String number;
    private final String message;

    public User(String name, String email, String number, String message) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
