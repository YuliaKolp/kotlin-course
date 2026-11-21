package org.lessons.org.lessons.lesson20.homeworks

/*
Задача 1
Напишите функцию analyzeDataType, принимающую параметр типа Any. Функция должна определить тип аргумента и вывести
соответствующее сообщение:
Для строки: "Это строка: [значение]".
Для любого числа: "Это число: [значение]".
Для списка: "Это список, количество элементов: [количество]".
Для словаря: "Это словарь, количество пар: [количество]".
Для остальных типов: "Неизвестный тип данных".
Используйте оператор is для проверки типов.
 */

fun analyzeDataType(inValue: Any?) {
    when (inValue) {
        is String -> println("Это строка: [$inValue]")
        is Number -> println("Это число: [$inValue]")
        is List<*> -> println("Это список, количество элементов: [${inValue.size}]")
        is Map<*, *> -> println("Это словарь, количество пар: [${inValue.size}]")
        else -> println("Неизвестный тип данных [$inValue]")
    }
}

/*
Задача 2
Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую размер списка, если аргумент можно
безопасно привести к типу List. В случае неудачного приведения функция должна возвращать -1. Используйте as? для
безопасного приведения типа.
 */
fun safeCastToList(inValue: Any?):Int {
    val list = inValue as? List<*>

    return if (list != null) {
        list.size
    } else {
        -1
    }
}

/*
Задача 3
Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any? и возвращает длину строки, если аргумент
можно привести к типу String. В случае, если аргумент равен null или не является строкой, функция должна возвращать 0.
 */
fun getStringLengthOrZero(inValue: Any?): Int {
    return if (inValue is String) {
        inValue.length
    } else {
        0
    }
}

/*
Задача 4
Создайте функцию-расширение класса Any toSquare. Функция гарантированно вызывается у числа (в виде числа или строки,
например 4 или 4.2 или “4.2”) и должна вернуть квадрат этого числа. Если придёт число, его нужно возвести в квадрат,
если придёт строка, то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.
 */
fun Any.toSquare(): Double {
    val number = (this as? Number)?.toDouble()
        ?: (this as String).toDouble()
    return number * number
}

/*
Задача 5
Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any и возвращает сумму всех
целочисленных (Int) и вещественных (Double) значений в списке. Все остальные типы должны быть проигнорированы.
 */
fun sumIntOrDoubleValues(inList: List<Any?>): Double {
//    var outSum: Double = 0.0
//    for (entry in inList){
//        if (entry is Int) {
//            outSum += entry.toDouble()
//            outSum += entry
//        } else if (entry is Double) {
//            outSum += entry
//        }
//    }
//    return outSum
    return inList.sumOf { (it as? Int)?.toDouble() ?: (it as? Double) ?: 0.0 }
    // return inList.sumOf { (it as? Number)?.toDouble() ?: 0.0 }
}


/*
Задача 6
Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и пытается привести его к типу List<*>.
Если приведение успешно, функция должна напечатать все строки из списка, если элемент не является строкой то вывести
предупреждение об этом. Если приведение неудачно, должно быть выведено сообщение об ошибке, не прерывая выполнение
программы.
 */
fun tryCastToListAndPrint(inValue: Any?) {
    val castedList = inValue as? List<*>
    if (castedList==null) {
        print("Alas")
        return
    }

    for (entry in castedList){
        if (entry is String) {
            print("\"$entry\" is string!!!")
        }
        else {
            print("WARN: \"$entry\" is not string!!!")
        }
    }
}

fun main() {
    var valuesToCheckType = mutableListOf(0, "super-duper", 23, 23f, 587L, mutableListOf(55,"55", null, 787),
        mutableMapOf(1 to "one", 2 to "two"), 'Q', null, -100)

    println("Task #01------------------------------------------")
    for (entry in valuesToCheckType) {
        analyzeDataType(entry)
    }

    println("Task #02------------------------------------------")
    for (entry in valuesToCheckType) {
        println("Arg is '$entry' list size after cast is ${safeCastToList(entry)}"
        )
    }

    println("Task #03------------------------------------------")
    for (entry in valuesToCheckType) {
        println("Arg is '$entry' string length is ${getStringLengthOrZero(entry)}"
        )
    }

    println("Task #05------------------------------------------")
    println("Sum is ${sumIntOrDoubleValues(valuesToCheckType)}")


    println("Task #06------------------------------------------")
    for (entry in valuesToCheckType) {
        println("Try to cast arg '$entry'. ")
        tryCastToListAndPrint(entry)
        println()
    }

    println("Task #04------------------------------------------")
    println(4.toSquare())
    println(4.2.toSquare())
    println("4.2".toSquare())

}
