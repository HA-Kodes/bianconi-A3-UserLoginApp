package com.coderscampus;

public class UserService {

    private User[] userList = new User[4];

    public UserService() {// default constructor
        System.out.println(userList);
        generateUsers();
        System.out.println(userList);
    }

    private void generateUsers() {
        FileService fileService = new FileService();
        userList = fileService.readDataFile();

    }

    public User getUserCredential(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {


                return user;
            }
        }

        return null;

    }
}
