package com.CourierServiceManagement

class payment {

    fun payBill(amount: Double): Double{
        val deliveryCharge = amount * 0.05
        return amount + deliveryCharge
    }
}