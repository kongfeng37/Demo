package com.whkf.st

class StVarialbles {
    fun main() {
        var a: String= "initial"
        var a1 = "kong";
        val b: Int= 1;
        val c = 2;
        a = "kongf"
        //b = 3;

        val d : Int
        d = 5;
        println(d)
        //d = 6;//must be initialized before the first read

        var neverNull: String = "initial"
        //neverNull = null
        var neverNull1 = "neverNull"
        //neverNull1 = null;
        var nullable: String? = "kong"
        nullable = null
        fun strLen(str: String): Int {
            return str.length;
        }
        strLen(neverNull)
        //strLen(nullable);

        fun describeStr(str: String?): String = if(str != null && str.isNotEmpty()) {
            "1111111111"
        } else {
            "222222222222"
        }
    }
}