package org.lessons.org.lessons.lesson17.homeworks

import kotlin.math.min

class Account(private var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun getBalance(): Double {
        return balance
    }

    fun withdraw(amount: Double): Double {
        if (amount > 0) {
            val withdraw = min(amount, balance)
            balance -= withdraw
            return withdraw
        }
        return 0.0
    }
}

fun main() {

    val account = Account(0.0)
    account.deposit(15.0)
    //println(account.balance)
    println("Текущий баланс ${account.getBalance()}")
    println("Хочу снять 12 и получаю ${account.withdraw(12.0)}")
    println("Текущий баланс ${account.getBalance()}")
    println("Хочу снять 10 но получаю ${account.withdraw(10.0)}")
    println("Текущий баланс ${account.getBalance()}")
}