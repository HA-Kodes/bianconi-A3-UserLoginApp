package com.coderscampus;

public class User {
// class variable declaration for properties of user's class

    private String username;
    private String password;
    private String name;

// parameterized constructor to inject values
    public User(String username, String password, String name) {
//        instantiation below

        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }// not being used, for ed purposes only

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }// not being used, for ed purposes only

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }// not being used, for ed purposes only

    @Override
    public String toString() {
        return this.username + " " + this.password + " " + this.name;
    }
}
