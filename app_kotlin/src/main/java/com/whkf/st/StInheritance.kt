package com.whkf.st

class StInheritance {
    fun main() {
        val dog: Dog = YorkShire();
        dog.sayHello();
    }
}
//open表示可继承
open class Dog {
    open fun sayHello() {
        println("wow")
    }
}

class YorkShire: Dog() {
    override fun sayHello() {
        println("wif")
    }
}

/**
 * 带参继承，参数传递
 * */
open class Animal(val name: String, var age: Int) {
    open fun printName() {
        println(name)
    }
}

class Tigger: Animal("Tigger", 2) {
    override fun printName() {
        println(name)
        age = 3;
    }
}

class Lion(age: Int): Animal("lion", age) {
    override fun printName() {
        println(name)
    }
}