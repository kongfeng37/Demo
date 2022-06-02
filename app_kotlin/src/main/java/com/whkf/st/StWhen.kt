package com.whkf.st

class StWhen {
    fun main() {
        choose("hello")
        choose(1)
        choose(2L)
        choose(3.14)
        choose("other")

        println(whenAssign("Hi"))
    }

    fun choose(obj: Any) {
        when(obj) {
            "hello" -> println("hello")
            1 -> println("num:$obj")
            is Long -> println("is Long")
            !is String -> println("is not string")
            else -> println("Unknown")
        }
    }

    fun whenAssign(obj: Any) : Any {
        return when(obj) {
            "hello" -> println("hello")
            1 -> println("num:$obj")
            is Long -> println("is Long")
            !is String -> println("is not string")
            else -> println("Unknown")
        }
    }
}