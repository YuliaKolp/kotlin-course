package org.lessons.org.lessons.lesson16.homeworks

/*
Животные и Их Звуки
Базовый класс: Animal с методом makeSound().
Классы наследники: Dog, Cat, Bird.
Базовый метод makeSound() в классе Animal выводит "This animal makes no sound."
Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog выводил "Bark", Cat - "Meow", Bird - "Tweet". Обогати вывод звуков цветом.
Создайте список животных List<Animal> и вызовите в цикле метод makeSound()

 */
object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}
object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}

open class MyAnimal(val name: String,
                        val age: Int){
    open fun makeSound(){
        println("This animal makes no sound.")
    }

}

class MyDog(name: String,
            age: Int,
            val color: String,
            val backgroundColor:String
    ):
    MyAnimal(name, age){
    override fun makeSound() {
        println("$color$backgroundColor Dog - \"Bark\"${Colors.RESET}")
    }
}

class MyCat(name: String,
            age: Int,
            val color: String,
            val backgroundColor:String
):
    MyAnimal(name, age){
    override fun makeSound() {
        println("$color$backgroundColor Cat - \"Meow\"${Colors.RESET}")

    }
}

class MyBird(name: String,
            age: Int,
            val color: String,
            val backgroundColor:String
):
    MyAnimal(name, age){
    override fun makeSound() {
        println("$color$backgroundColor Bird - \"Tweet\"${Colors.RESET}")
    }
}

fun main() {
    val animals: List<MyAnimal> = listOf(MyDog("Bluey", 3, Colors.BLUE, Background.GREEN),
        MyCat("Tom", 5, Colors.RED, Background.YELLOW),
        MyBird("Poppy", 1, Colors.BLACK, Background.PURPLE))
    for (animal in animals) {
        print("Name: ${animal.name}. Age: ${animal.age}")
        animal.makeSound()
    }
}