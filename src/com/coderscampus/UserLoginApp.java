package com.coderscampus;

import java.util.Scanner;

public class UserLoginApp {

    public static void main(String[] args) { // special function

        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        System.out.println("Welcome, please login...");

        int loginAttempts = 0; //initializing the value
        User validUser;

        while (true) {
            System.out.println("Enter your email: ");
            String username = scanner.nextLine();

            System.out.println("Enter your password: ");
            String password = scanner.nextLine();

            validUser = userService.getUserCredential(username, password);

            if (validUser != null) {
                System.out.println("Welcome: " + validUser.getName());
                break;
            } else if (loginAttempts == 4) {
                System.out.println("Too many invalid logins. You are now locked out.");
                break;
            } else {
                System.out.println("Invalid login, try again.");
                loginAttempts++;

            }
        }
        System.out.print("Thank you for reviewing my elementary efforts!");
        System.out.print("  i am grateful to have gotten as far as i have");
        System.out.print(" seriously!!!");
        System.out.print("  Working on being able to walk through my lines,");
        System.out.println("  if ever, a classmate asks me to explain (•◡•)");


    }
}
// REVIEWER:  why is there only 4 login attempts when assignment asks for 5
// in example 1