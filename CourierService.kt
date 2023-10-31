package com.CourierServiceManagement
import kotlin.random.Random


fun main() {
        val cu = Customers()
        val s = SignUp()
        s.display()

        val c = Company("123 Main Street",
            "1234567890", "myCompany@gmail.com")
        c.displayDetails()
      //  c.choose()

        val p = product()
        p.display()
        val o = order()
        o.getData()
        o.display()

        val randomInt = Random.nextInt(1, 101)

        val d = DeliveryTicket(randomInt)
        d.display()

        val r= ReviewAndRate()
        r.display()

    }
