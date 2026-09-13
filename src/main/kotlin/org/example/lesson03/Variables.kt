package org.example.lesson03

val name: String = "Alice"
var age = 35

lateinit var phoneNumber: String
const val PI: Double = 3.114

val lazyValue: String by lazy {
    Thread.sleep(2000)
    "this is very laze String"
}

// getters and setters
var count: Int = 0
    get() {
        return if (field > 100) field else 0
    }
    set(value) {
        if (value >= 0) field = value
    }

fun test() {
    println(name)
    println(age)
    age = 31
    println(age)
    phoneNumber = "12345"
    println(phoneNumber)
}