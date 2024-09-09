
Assignment #3:   User Validation with CSV File

The goal for this assignment will be to mimic a user login from a Java console application.

You will prompt a user for a username and a password, and then use the inputs you receive to validate whether or not the username / password combination is valid.

In order to validate this username / password combination, you'll need to read this information from a file (called "data.txt") and import the data into your Java application

Click here to download the data.txt file  --  https://s3.amazonaws.com/javavideotutorials.net/exerciseFiles/data.txt

You should create a User POJO that will store the information that will be read from the file.

The User POJO should contain three properties:

  1. username
  2. password
  3. name

The file information should be stored in your Java application as an Array of User objects.

Once this data is appropriately stored in your Java application, you can begin the process of prompting for username and password.

Using a Scanner, you can ask the user for a username and password (this is kind of like a real-world application where you would be presented with a login screen). But for our purposes, we'll be using the console to collect the user's input.

Once you've collected a username and a password via your Scanner, you can begin the process of validating this input against our Array of User objects.

You will need to iterate through the User objects and check to see if the username/password inputs that you received via the Scanner match any of the User objects in your Array. See the "Determining a Match" section below for info on how to determine if there's a valid match or not.

If a match is found then you should display a message that says:

Welcome {insert user's name here}

Note: you should populate the {insert user's name here} portion with the name of the User which matches the inputted username/password.

Once a user has successfully logged in, the program can terminate.

If no match is found then you should display a message that says:

Invalid login, please try again.

In the event that there's an invalid login attempt, the user should only be given 5 chances in total to login. If the user fails to login after their 5th attempt, the program should output a message that states:

Too many failed login attempts, you are now locked out.

And the program should terminate.

Determining a Match

A match is found when two conditions are met:

  1. The inputted username is a case insensitive match with the username property in the User object
  2. The inputted password is a case sensitive match with the password property in the User object.

For example:

inputted username = TREVOR@CRAFTYCODR.COM
User object's username = trevor@craftycodr.com
MATCH

inputted username = trevor.page@craftycodr.com
User object's username = trevor@craftycodr.com
NO MATCH

inputted password = test123
User object's password = test123
MATCH

inputted password = Test123
User object's password = test123
NO MATCH

Program Design

The goal of this assignment is to start to use our own Classes and get comfortable with them.

You should make use of a UserService class that will help with things like validating if the inputted username/password matches what's in our User Array. It should also provide the service of reading the data from the file and creating the User Array.

You should also make sure to create a User POJO Class as defined near the beginning of this document.

The rest of the logic can be held inside of a UserLoginApplication Class, which houses the "public static void main" method.

Reminder: When you've completed this assignment you must submit it for review via the assignment submission app(you can use the same credentials to login there as you've used to login here)
  
Sample Output

Use Case #1: User attempts too many failed logins and is locked out:

    Enter your email:
    test@test.com
    Enter your password:
    asdfasdf
    Invalid login, please try again

    Enter your email:
    test@test.com
    Enter your password:
    asdfasdf
    Invalid login, please try again

    Enter your email:
    test@test.com
    Enter your password:
    asdfasdf
    Invalid login, please try again

    Enter your email:
    test@test.com
    Enter your password:
    asdfasdf
    Too many failed login attempts, you are now locked out.

Use Case #2: User successfully logs in

    Enter your email:
    test@test.com
    Enter your password:
    asdfasdf
    Invalid login, please try again

    Enter your email:
    john.doe@mydomain.net
    Enter your password:
    Hdk398jf!
    Welcome: John Doe


© Coders Campus 2024
Version: 2.0.0.0
Privacy Policy | Terms of Service
