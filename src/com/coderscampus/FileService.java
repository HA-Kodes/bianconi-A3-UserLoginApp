package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

    public User[] readDataFile() {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("bianconi-A3-UserLoginApp/data.csv"))) {
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
