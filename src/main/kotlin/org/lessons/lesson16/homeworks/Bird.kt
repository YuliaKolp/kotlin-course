package org.lessons.org.lessons.lesson16.homeworks


class Bird : Animal() {
    override fun makeSound() {
        println("${BLUE}Tweet$RESET")
    }
}