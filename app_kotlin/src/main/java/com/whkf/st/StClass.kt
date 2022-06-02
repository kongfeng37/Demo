package com.whkf.st

class StClass {
    val custom = Custom();
    val contract = Contract(1, "asdfghj")

    fun main() {
        println(contract.x)
        println(contract.y)
        //contract.x = 2
        contract.y = "qwwert"
    }
}

class Custom
class Contract(val x: Int, var y: String)