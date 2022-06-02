package com.whkf.st

class StRanges {
    fun main() {
        for(i in 0..3) {
            println(i)
        }

        for(i in 0 until 3) {
            println(i)
        }

        for(i in 0 ..10 step 2) {
            println(i)
        }

        for(i in 10 downTo 0 step 3 ) {
            println(i)
        }

        val x = 2;
        if(x in 1..10) {
            println("$x is in range from 1 to 10")
        }
        if(x !in 6..10) {
            println("$x is not in range from 6 to 10")
        }
    }
}