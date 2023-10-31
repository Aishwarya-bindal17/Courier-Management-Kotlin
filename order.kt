package com.CourierServiceManagement

import java.lang.IllegalArgumentException
import java.time.LocalDate
import java.time.LocalTime
import java.util.*
import java.io.File

class order {
    var qty: Int = 0
    var res: Int = 0
    var tprice: Double = 0.0
    var sqty = 0
    var aqty = 0
    var pqty = 0
    var bqty = 0

    // Lambda function to calculate the total price for an item according to the quantity
    val pricePerItem: (Int, Int) -> Double = { itemPrice, quantity ->
        itemPrice * quantity.toDouble()
    }

    fun getData() {
        val sc = Scanner(System.`in`)
        var run = true

        while (run) {
            println("Please Select item number or select 5 to exit: ")
            res = sc.nextInt()
            if (res in 1..5) {

            }
            else {
                throw IllegalArgumentException("Item not present in menu")
            }

            when (res) {
                1 -> {
                    println("Bag selected")
                    println("Select quantity:")
                    qty = sc.nextInt()
                    val totalItemPrice = pricePerItem(100, qty)
                    tprice += totalItemPrice
                    sqty = qty
                }

                2 -> {
                    println("Shoes selected")
                    println("Select quantity:")
                    qty = sc.nextInt()
                    val totalItemPrice = pricePerItem(300, qty)
                    tprice += totalItemPrice
                    aqty = qty
                }

                3 -> {
                    println("Top selected")
                    println("Select quantity:")
                    qty = sc.nextInt()
                    val totalItemPrice = pricePerItem(100, qty)
                    tprice += totalItemPrice
                    bqty = qty
                }

                4 -> {
                    println("Jeans selected")
                    println("Select quantity:")
                    qty = sc.nextInt()
                    val totalItemPrice = pricePerItem(250, qty)
                    tprice += totalItemPrice
                    pqty = qty
                }

                5 -> run = false
                else -> println("Wrong Input")
            }
        }
    }


    fun display() {
        var finalPrice: Double
        finalPrice = payment().payBill(tprice)

        val outputFile = File("OrderDetails.txt")

        outputFile.appendText("-----------   ABC Company    ----------\n")
        outputFile.appendText("Order details are:\n")
        outputFile.appendText("Ordered Items:\n")
        outputFile.appendText("   Item    Quantity\n")
        if (sqty > 0) {
            outputFile.appendText("  Bag   $sqty\n")
        }
        if (pqty > 0) {
            outputFile.appendText("  Jeans      $pqty\n")
        }
        if (aqty > 0) {
            outputFile.appendText("  Shoes      $aqty\n")
        }
        if (bqty > 0) {
            outputFile.appendText("  Top     $bqty\n")
        }
        outputFile.appendText("Total Amount: Rs $tprice\n")

        outputFile.appendText("Payable Amount after adding delivery charge: Rs $finalPrice\n")

        val ld = LocalDate.now()
        outputFile.appendText("date: $ld\n")
        val lt = LocalTime.now()
        outputFile.appendText("time: $lt\n")
        outputFile.appendText("\n")

        println("Order details written to $outputFile.")

        var data= outputFile.readText()
        println(data)

    }
}

