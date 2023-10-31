package com.CourierServiceManagement

class product () {

    fun display() {
        println("----------   Items    ------------")
        println()
        val Items = arrayOf(
            "1. bag     Rs800",
            "2. shoes   Rs900",
            "3. top     Rs1000",
            "4. jeans   Rs1500"
        )
        for (i in Items.indices) {
            println(Items[i])
        }
    }
}
