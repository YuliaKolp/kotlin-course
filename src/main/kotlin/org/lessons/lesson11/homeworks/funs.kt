package org.lessons.org.lessons.lesson11.homeworks


/*
Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и
возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.
 */
fun noArgs01() {
    // 1. Не принимает аргументов и не возвращает значения.
}

// 2. Принимает два целых числа и возвращает их сумму.
fun getSum02(num1: Int, num2: Int): Int = num1 + num2

fun inStr03(inStr: String) {
    //3. Принимает строку и ничего не возвращает.
}
fun getAvg04(numList: List<Int>) : Double {
    // 4. Принимает список целых чисел и возвращает среднее значение типа Double.
    if (numList.isEmpty()) return 0.0
    var numSum: Double = 0.0
    for (entry in numList) {
        numSum += entry
    }
    return numSum / numList.size
}
private  fun getStrSize05(inStr: String?): Int? {
    // 5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
    //if (inStr)
    return inStr?.length
}
fun getNullableFlNums06(): Float? {
    // 6. Не принимает аргументов и возвращает nullable вещественное число.
    var outNum: Float? = null
    return outNum
}

private fun noReturn07(inList: List<Int>?) {
    // 7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
}

fun outStr08(inNum:Int): String? {
    // 8. Принимает целое число и возвращает nullable строку.
    var outStr: String? = null
    return outStr
}
fun outStrlist(): MutableList<String?> {
    // 9. Не принимает аргументов и возвращает список nullable строк.
    val outList: MutableList<String?> = mutableListOf(null)
    println(outList)
    return outList
}
fun outBool10(inStr: String?, inNum: Int?): Boolean? {
    // 10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
    var out:Boolean? = null
    return out
}

/*
Задачи на написание кода
Напишите валидную сигнатуру метода а так же рабочий код для задач.
 */
fun multiplyByTwo11(inNum: Int): Int {
    // 11.	Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
    return (inNum * 2)
}

fun isEven12(inNum: Int): Boolean {
    // 12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в
    // противном случае.
    var isEven: Boolean = false
    if (inNum % 2 == 0) isEven = true
    return isEven
}

fun printNumbersUntil13(n: Int) {
    // 13.	Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
    // Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

fun findFirstNegative14(inList: List<Int>): Int? {
    // 14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное
    // число в списке. Если отрицательных чисел нет, функция должна вернуть null.
    for (entry in inList){
        if (entry < 0) return entry
    }
    return null
}

fun processList15(inList: List<String?>) {
    // 15. Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить
    // каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без
    // возврата значения.
    for (entry in inList){
        if (entry == null) return
        println(entry)
    }
}

fun main() {
    outStrlist()
}