package com.CourierServiceManagement

class DeliveryTicket( val orderId: Int) {

    fun display() {
        println()
        println("------ Delivery Ticket ------")
        println("Order ID: $orderId")
        println("Your order has been shipped and will be delivered soon")

    }
}
