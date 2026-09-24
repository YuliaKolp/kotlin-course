package org.lessons.org.lessons.lesson07.homeworks

fun for_cycle(){
    //Прямой диапазон
    println("1. Напишите цикл for, который выводит числа от 1 до 5.")
    for (i in 1..5) {
        print("$i ")
    }
    println()

    println("2. Напишите цикл for, который выводит четные числа от 1 до 10.")
    for (i in 1..10) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
    println()

    // Обратный диапазон
    println("3. Создайте цикл for, который выводит числа от 5 до 1.")
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()


    println("4.Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.")
    for (i in 10 downTo 1) {
        print("${i-2} ")

    }
    println()

    // С шагом (step)
    println("5. Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.")
    for (i in 1..9 step 2) {
        print("${i-2} ")
    }
    println()

    println("6. Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.")
    for (i in 1..20 step 3) {
        print("$i ")
    }
    println()

    //Использование до (until)
    println("7. Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.")
    var size: Byte = 7
    println("size = '$size'")
    for (i in 3 until size step 2) {
        print("$i ")
    }
    println()

}

fun while_cycle(){
    println("8.Создайте цикл while, который выводит квадраты чисел от 1 до 5.")
    var counter = 1
    while (counter < 6) {
        print("${counter * counter} ")
        counter++
    }
    println()

    println("9. Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль")
    counter = 10
    while (counter >= 5) {
        print("$counter ")
        counter--
    }
    println()

}

fun do_while_cycle(){
    println("10. Используйте цикл do while, чтобы вывести числа от 5 до 1")
    var counter = 5
    do {
        print("$counter ")
        counter--
    } while (counter > 0)
    println()

    println("11. Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.")
    counter = 5
    do {
        print("$counter ")
        counter++
    } while (counter < 10)
    println()

}

fun break_cycle(){
    println("12. Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.")
    for (i in 1..10){
        print("$i ")
        if (i == 6) break
    }
    println()

    println("13. Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.")
    var counter = 1
    while (true) {
        if (counter == 10) break
        print("$counter ")
        counter++
    }
}
fun continue_cycle(){
    println("13. В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.")
    for (i in 1 .. 10) {
        if (i % 2 == 0){
            continue
        }
        print("$i ")
    }
    println()

    println("14. Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.")
    var counter = 10
    while (counter >= 1) {
        if (counter % 3 == 0) {
            counter--
            continue
        }
        print("$counter ")
        counter--
    }
    println()

}


fun main() {
    for_cycle()
    while_cycle()
    do_while_cycle()
    break_cycle()
    continue_cycle()

}
