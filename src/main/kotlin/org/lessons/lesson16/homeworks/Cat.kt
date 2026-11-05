package org.lessons.org.lessons.lesson16.homeworks

class Cat : Animal() {
    override fun makeSound() {
        println("${YELLOW}Meow$RESET")
    }
}