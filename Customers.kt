package com.CourierServiceManagement

import java.util.*

class Customers {
    var name: Name?=null
    var address: Address?=null
    var phoneNo: Long = 0
    var location: String=""
    val data: Unit
        get() {
            println("Please enter your details: ")
            val sc = Scanner(System.`in`)
            println("Name: ")
            name = Name(sc.next(), sc.next(), sc.next())
            println("address: ")
            address = Address(sc.next(), sc.next(), sc.next())
            println("phoneNo: ")
            phoneNo = try {
                sc.nextInt().toLong()
            }
            catch (e: Exception) {
                throw Error("Enter valid no.")
            }
            println("location: ")
            location=sc.next()
        }

    fun display() {
        println("User details are: ")
        System.out.println("Name: " + (name?.fullName ?: ""))
        System.out.println("address: " + (address?.addressDetails ?: ""))
        println("phone Number: $phoneNo")
        println("location: $location")
        println()
        println()
    }
}
