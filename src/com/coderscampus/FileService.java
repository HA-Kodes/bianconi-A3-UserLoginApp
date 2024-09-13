package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
    private String filename = "data.csv";

    public User[] readDataFile() {// function signature
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
            User[] userList = new User[4];
            String line;
            int i = 0;

            while ((line = fileReader.readLine()) != null) {
                String[] userData = line.split(",");

                String username = userData[0];
                String password = userData[1];
                String name = userData[2];

                User user = new User(username, password, name);

                userList[i] = user;
                i++;

            }

            return userList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
