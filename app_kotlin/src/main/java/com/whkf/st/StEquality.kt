package com.whkf.st

class StEquality {
    fun main() {
        val a = setOf("111", "222", "333")
        val b = setOf("333", "222", "111")
        println(a == b)//true
        println(a === b)//false
    }
}