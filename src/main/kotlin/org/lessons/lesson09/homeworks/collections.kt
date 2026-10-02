package org.lessons.org.lessons.lesson09.homeworks

fun stringEntry(strArray: Array<String>, substrToFind: String){
    /*
    10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
    в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
     */
    var isFound: Boolean = false
    for (i in 0 until strArray.size){
        if (strArray[i].contains(substrToFind)) {
            println("1ый элемент, где найдена подстрока - '${strArray[i]}'. Его индекс - '$i'")
            isFound = true
            break
        }
    }
    if (!isFound) println("элемент c подстрокой не найден")
}

fun arraysExamples(){

    // 1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val intArrayExample1 = arrayOf(1, 2, 3, 4, 5)
    //println(intArrayExample1)

    //2. Создайте пустой массив строк размером 10 элементов.
    val emptyStringArray = Array(10) { "" }

    //3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val doubleArraySize = 5
    var doubleArrayExample2 = DoubleArray(doubleArraySize)
    for (i in 0 until doubleArraySize){
        doubleArrayExample2[i] = i * 2.0
    }

    //4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение,
    // равное его индексу, умноженному на 3.
    val intArraySize = 5
    var intArrayExample4 = IntArray(intArraySize)
    for (i in 0..(intArraySize - 1)){
        intArrayExample4[i] = i * 3
    }

    // 5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val stringNullableArray5: Array<String?> = arrayOf("qwe", null, "asd")

    // 6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val intArrayCopy6 = IntArray(intArrayExample1.size)
    for (i in 0 until intArrayExample1.size) {
        intArrayCopy6[i] = intArrayExample1[i]
    }

    // 7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    // Распечатайте полученные значения.
    var intArrayExample7 = IntArray(intArraySize)
    for (i in 0 until intArrayExample7.size) {
        intArrayExample7[i] = intArrayExample4[i] - intArrayExample1[i]
        println("${intArrayExample4[i]} - ${intArrayExample1[i]} = ${intArrayExample7[i]}")
    }
    //  8. Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве,
    //  печатаем -1. Реши задачу через цикл while.
    val entryToFind = 5
    var j:Int = 0
    var isFound: Boolean = false
    while (j < intArrayExample7.size){
        if (intArrayExample7[j] == entryToFind) {
            println("индекс элемента со значением 5 равен '$j'")
            isFound = true
            break
        }
        j += 1
    }
    if (!isFound) {println("-1 значения 5 нет в массиве")}


    // 9. Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
    // Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    var intArrayExample9 = arrayOf(-4, 58, 31, 26, 3, 14, 0, 52, 77, 800, 9, 610)
    for (i in 0 until intArrayExample9.size) {
        if (intArrayExample9[i] % 2 == 0) {
            println("${intArrayExample9[i]} is even")
        } else println("${intArrayExample9[i]} is odd")
    }

    // 10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве
    // элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
    val progLanguages: Array<String> = arrayOf("Kotlin", "Java", "Python", "", "C++", "JavaScript", "Python")
    stringEntry(progLanguages, "onl")

}

fun listExamples() {

    // 1. Создайте пустой неизменяемый список целых чисел.
    val readOnlyListInt1: List<Int> = listOf()

    //2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val readOnlyListStr2: List<String> = mutableListOf("Hello", "World", "Kotlin")

    //3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    var listInts3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    //4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    listInts3.addAll(listOf(6, 7, 8))

    // 5. Имея изменяемый список строк, удалите из него определенный элемент.
    var listStr5: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    listStr5.remove("World")
    println(listStr5)

    // 6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    for (entry in listInts3) {
        println(entry)
    }

    // 7. Создайте список строк и получите из него второй элемент, используя его индекс.
    println(listStr5[1])

    //8. Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с
    // индексом 2 на новое значение).
    var mtblList8: MutableList<Int> = mutableListOf(-4, 58, 31, 26, 3, 14, 0, 52, 77, 800, 9, 610)
    mtblList8[1] = 200
    println(mtblList8)

    //9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу
    // с помощью циклов.
    val listStr9: List<String> = listOf("Kotlin", "Java", "Python", "C++", "JavaScript", "Python")
    val listStr9_: List<String> = listOf("Lisp", "Ada", "Assembler")
    var listStrUited9: MutableList<String> = mutableListOf()
    for (entry in listStr9) {
        listStrUited9.add(entry)
    }
    for (entry in listStr9_) {
        listStrUited9.add(entry)
    }
    println(listStrUited9)

    // 10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val listInt10: List<Int> = listOf(-4, 58, 31, 26, 3, 14, 0, 52, 77, 800, 9, -610, 957)
    if (listInt10.size == 0){
        println("List is empty. No max min values to find")
    }
        else {
        var minEntry: Int = listInt10[0]
        var maxEntry: Int = listInt10[0]
        for (i in 1 until listInt10.size) {
            if (listInt10[i] > maxEntry) {
                maxEntry = listInt10[i]
            }
            if (listInt10[i] < minEntry) {
                minEntry = listInt10[i]
            }
        }
        println("max entry is '$maxEntry', min enry is '$minEntry'")
    }

    // 11. Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка
    // используя цикл.
    var listInt11: MutableList<Int> = mutableListOf()
    for (entry in listInt10) {
        if (entry % 2 == 0) {listInt11.add(entry)}
    }
    println("List of even numbers '$listInt11'")

}

fun findStrInSet(setToSearch: Set<String>, strToFind: String): Boolean{
    /*
    7. Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная
    строка. Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
    */
    var isFound: Boolean = false
    for (entry in setToSearch){
        if (entry == strToFind) {
            isFound = true
            break
        }
    }
    println(isFound)
    return isFound
}
fun setExamples(){

    // 1. Создайте пустое неизменяемое множество целых чисел.
    val numbersSet1: Set<Int> = emptySet()

    // 2. Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val numbersSet2: Set<Int> = setOf(1, 2, 3)

    // 3. Создайте изменяемое множество строк и инициализируйте его несколькими значениями
    // (например, "Kotlin", "Java", "Scala")
    val strSet3: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")

    // 4. Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    strSet3.add("Swift")
    strSet3.add("Go")

    //5. Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val numbersSet5: MutableSet<Int> = mutableSetOf(45,0, 11, 7, 2, 9,38)
    numbersSet5.remove(2)
    println(numbersSet5)

   // 6. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    for (entry in numbersSet5) {
        println(entry)
    }

    // 7. Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная
    // строка. Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
    val strSet7: Set<String> = setOf("Kotlin", "Java", "Python", "C++", "JavaScript", "Python")
    findStrInSet(strSet7, "C+++")

    //8. Создайте неизменяемое множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
    val strSet8: Set<String> = setOf("Kotlin", "Java", "Python", "C++", "JavaScript", "Python")
    var strList8: MutableList<String> =  mutableListOf()
    for (entry in strSet8) {
        strList8.add(entry)
    }
    println(strList8)

}
fun main() {
    arraysExamples()
    listExamples()
    setExamples()
}