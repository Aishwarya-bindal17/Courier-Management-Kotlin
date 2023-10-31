package com.CourierServiceManagement
import java.util.*


class SignUp {
    var MAX_USERS = 10
    var usernames: Array<String?> = arrayOfNulls(MAX_USERS)
    var passwords: Array<String?>
    var userCount: Int

    init {
        passwords = arrayOfNulls(MAX_USERS)
        userCount = 0
    }

    // Method to register a new user
    fun registerUser(username: String?, password: String?): Boolean {
        if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
            if (userCount < MAX_USERS) {
                // Check if the username is already taken
                for (i in 0 until userCount) {
                    if (usernames[i] == username) {
                        return false // User already exists
                    }
                }
                usernames[userCount] = username
                passwords[userCount] = password
                userCount++
                return true // User registered successfully
            }
        }
        return false // Invalid username or password, or maximum users reached
    }

    // Method to check if a user with the given username exists
    fun userExists(username: String): Boolean {
        for (i in 0 until userCount) {
            if (usernames[i] == username) {
                return true
            }
        }
        return false
    }

    // Method to authenticate a user
    fun authenticateUser(username: String, password: String): Boolean {
        for (i in 0 until userCount) {
            if (usernames[i] == username && passwords[i] == password) {
                return true // User authenticated successfully
            }
        }
        return false // Authentication failed
    }

    fun display() {
        val signUp = SignUp()
        val scanner = Scanner(System.`in`)
        println("Sign-Up Page!")
        while (true) {
            print("Enter a username (or 'exit' to quit): ")
            val username = scanner.nextLine()
            if (username == "exit") {
                break
            }
            print("Enter a password: ")
            val password = scanner.nextLine()
            val c = Customers()
            c.data
            c.display()
            if (signUp.registerUser(username, password)) {
                println("User registered successfully.")
            } else {
                println("User registration failed. Try a different username or check the password.")
            }
        }
        print("Enter your username to log in: ")
        val username = scanner.nextLine()
        print("Enter your password: ")
        val password = scanner.nextLine()
        if (signUp.authenticateUser(username, password)) {
            println("User authenticated successfully.")
        } else {
            println("User authentication failed.")
        }
    }
}
