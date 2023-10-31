package com.CourierServiceManagement
import java.util.*
class Company constructor(address: String, contactNumber: String, email: String) {
    //var name: String
    var address: String
    var contactNumber: String
    var email: String

    init {
        //  this.name = name
        this.address = address
        this.contactNumber = contactNumber
        this.email = email
    }

    companion object {
        var Name="ABC Company"
    }


    fun displayDetails() {
        println("------ ${Company.Name} Details---------")
        println()
        println("Name: ${Company.Name}")
        println("Address: " + address)
        println("Contact Number: $contactNumber")
        println("Email id: $email")
        println()
    }
}
/*fun Company.choose() {
    println("Welcome to ${Company.CompName}!")
    println()
    println("Please choose an option:")
    println("1. track")
    println("2. order")

    var sc = Scanner(System.`in`)
    var choice = sc.nextInt()

    when (choice) {
        1 -> println("You have chosen to track order.")
        2 -> println("You have chosen to place an order.")
        else -> println("Invalid choice. Please select 1 for dine-in or 2 for online order.")
    }
}*/