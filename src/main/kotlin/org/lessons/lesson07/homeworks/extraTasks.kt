package org.lessons.org.lessons.lesson07.homeworks

fun timesTable() {
    println("1. Используя вложенный цикл реализовать таблицу умножения, как на картинке")
    for (i in 1..10){
        for (j in 1 .. 10){
            print("${i * j} ")
        }
        println()
    }

}

fun argSum(counter: Int): Int{
    println("2. Напишите функцию, которая суммирует числа от 1 до 'arg' ($counter) с помощью цикла for. 'arg' - целочисленный аргумент функции.")
    var outSum: Int = 0
    for (i in 1..counter){
        outSum = outSum + i
    }
    return outSum
}

fun factorial(inNumber: Int): Int {
    println("3.  Напишите функцию, которая вычисляет факториал числа 'arg' ($inNumber) с использованием цикла while.")
    var factorialResult: Int = 1
    for (i in 1..inNumber){
        factorialResult = factorialResult * i
    }
    return factorialResult
}

fun evenSums(inNumber: Int): Int {
    println("4. Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg' ($inNumber), используя цикл while.")
    var outSum = 0
    var i = 2
    while (i <= inNumber){
        if (i % 2 == 0){
            outSum = outSum + i
        }
        i++
    }
    return outSum
}

fun rectangle(){
    println("5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.")
    var i = 1
    while (i <= 3){
        var j = 1
        while (j <= 5 ){
            print('*')
            j++
        }
        println()
        i++
    }
}

fun evenOddSums(inNumber: Int) {
    println("6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg ($inNumber)")
    var outEvenSum = 0
    var outOddSum = 0
    for (i in 1..inNumber){
        if (i % 2 == 0) {
            outEvenSum = outEvenSum + i
        }
        else {
            outOddSum = outOddSum + i
        }
    }
    println("Odd numbers sum is '$outOddSum'")
    println("Even numbers sum is '$outEvenSum'")
}

fun main() {
    timesTable()
    println()

    println(argSum(4))
    println()

    println( factorial(5))
    println()

    println(evenSums(6))
    println()

    rectangle()
    println()

    evenOddSums(4)
    println()
}