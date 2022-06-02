package com.whkf.st

class HelloWorld {
    fun printMessage(message: String): Unit {
        println(message)
    }

    fun printMessage(message: String, prefix: String= "info") {
        println("[$prefix]$message")
    }

    fun printMessage(vararg meggages: String) {
        for(msg in meggages) {
            println(msg)
        }
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun multiply(x: Int, y: Int) = x * y

    fun main(args: ArrayList<String>) {
        println("HelloWord")
        printMessage("HelloWord1")
        printMessage("HelloWord2", "Kong")
        printMessage("Hello", "World", "kong")
        println(sum(1, 2))
        println(multiply(2, 3))
    }
}