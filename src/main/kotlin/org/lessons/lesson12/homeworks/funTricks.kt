package org.lessons.org.lessons.lesson12.homeworks

fun ff01(numbers: List<Int>) {
    /*
    Задачи на приведение коллекции к значению
     */

    // 1. Проверить, что размер коллекции больше 5 элементов.
    if (numbers.size > 5) {
        println("#1: размер коллекции больше 5 элементов")
    }

    //2. Проверить, что коллекция пустая
    if (numbers.isEmpty()) {
        println("#2: коллекция пустая")
    }

    // 3. Проверить, что коллекция не пустая
    if (!numbers.isEmpty()) {
        println("#3: коллекция не пустая")
    }


    // 4. Взять элемент по индексу или создать значение если индекса не существует
    println(numbers.getOrElse(1000) { 7777 })

    //5. Собрать коллекцию в строку
    val numbersString = numbers.joinToString("--")
    println(numbersString)

    //6. Посчитать сумму всех значений
    println("#6 ${numbers.sum()}")

    // 7. Посчитать среднее
    println("#7 ${numbers.average()}")

    // 8. Взять максимальное число
    // 9. Взять минимальное число
    println("#8-9 max = ${numbers.maxOrNull()}; min = ${numbers.minOrNull()}")

    // 10. Взять первое число или null
    println("#10 first = ${numbers.firstOrNull()}")


    // 11. Проверить что коллекция содержит элемент
    val entryToCheck = -7777
    if (entryToCheck in numbers) {
        println("#11 entry is present")
    }
}


fun ff02(numbers: List<Int?>) {
    /*
    Реши задачи подходящим методом для работы с коллекцией. Для каждой задачи есть свой метод, не повторяйся. Список
    методов в рекомендациях под заданиями.
    Задачи на обработку коллекций
     */

    // 12. Отфильтровать коллекцию по диапазону 18-30
    val filteredNums12 = numbers.filter { it in 18..30 }
    println("#12: $filteredNums12")

    // 13. Выбрать числа, которые не делятся на 2 и 3 одновременно
    val filteredNums13 = numbers.filterNotNull().filter { (it % 2 != 0) && (it % 3 != 0)}
    println("#13: $filteredNums13")

    // 14. Очистить текстовую коллекцию от null элементов
    val filteredNums14 = numbers.filter { true }
    println("#13: $filteredNums14")

    // 19.	Распечатать квадраты элементов списка
    numbers.filterNotNull().forEach{
        val num = it ?: 0
        print("#19 ${num * num} ")
    }
    println()

    // 21. Очистить список от дублей
    val uniqueNums = numbers.distinct()
    println("#21 $uniqueNums")

    // 22.	Отсортировать список по убыванию
    println("#22 ${numbers.filterNotNull().sortedDescending()}")

    // 23.	Взять последние 3 элемента списка
    println("#23 ${numbers.takeLast(3)}")

}

fun ffText03(strList: List<String?>) {
    /*
    Реши задачи подходящим методом для работы с коллекцией. Для каждой задачи есть свой метод, не повторяйся. Список
    методов в рекомендациях под заданиями.
    Задачи на обработку коллекций
     */

    // 15.	Преобразовать текстовую коллекцию в коллекцию длин слов
    val out15: List<Int> = strList.map{(it ?: "").length }
    println("#15: $out15")

    // 16.	Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
//    val out16 = strList.associate {
//        val word = it ?: ""
//        word.reversed() to word.length
//    }
    val out16 = strList.filterNotNull().associate{it.reversed() to it.length }
    println("#16: $out16")

    // 17.	Отсортировать список в алфавитном порядке
    val out17 = strList.filterNotNull().sorted()
    println("#17: $out17")

    // 18. Взять первые 3 элемента списка
    val out18 = strList.take(3)
    println("#18: $out18")

    // 20. Группировать список по первой букве слов
    val out20 = strList.filterNotNull().filter { it.isNotEmpty() }.groupBy { it.first() }
    println("#20: $out20")

}

fun ff24(numbers: List<Int>) {
    /*
    Задача 24. Характеристика числовой коллекции
    Напиши функцию, которая принимает коллекцию чисел и возвращает строку с характеристикой коллекции используя конструкцию when
    •	Если коллекция пустая - “Пусто”
    •	Если количество элементов меньше пяти - “Короткая”
    •	Если коллекция начинается с 0 - “Стартовая”
    •	Если сумма всех чисел больше 10000 - “Массивная”
    •	Если среднее значение равно 10 - “Сбалансированная”
    •	Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
    •	Если максимальное число меньше -10 - “Отрицательная”
    •	Если минимальное число больше 1000 - “Положительная”
    •	Если содержит одновременно числа 3 и 14 - “Пи***тая”
    •	Иначе - “Уникальная”
    Вызвать метод с данными, подходящими под каждую из веток
     */
    var isUnique = true

    if (numbers.isEmpty()) {
        println("Пусто")
        isUnique = false
        return}

    if (numbers.size < 5) {
        println("Короткая")
        isUnique = false
    }

    if (numbers.firstOrNull() == 0) {
        println("Стартовая")
        isUnique = false
    }

    if (numbers.sum() > 10000) {
        println("Массивная")
        isUnique = false
    }

    if (numbers.average() == 10.0) {
        println("Сбалансированная")
        isUnique = false
    }

    if ( numbers.joinToString("").length == 20) {
        println("Клейкая")
        isUnique = false
    }

    if ((numbers.maxOrNull() ?: 0) < -10) {
        println("Отрицательная")
        isUnique = false
    }

    if ((numbers.minOrNull() ?: 0) > 1000) {
        println("Положительная")
        isUnique = false
    }

    if (numbers.contains(3) && numbers.contains(14)) {
        println("Пи***тая")
        isUnique = false
    }

    if (isUnique) {
        println("Уникальная")
    }

    return

//    return when {
//        numbers.isEmpty() -> "Пусто"
//        numbers.size < 5 -> "Короткая"
//        numbers.firstOrNull() == 0 -> "Стартовая"
//        numbers.sum() > 10000 -> "Массивная"
//        numbers.average() == 10.0 -> "Сбалансированная"
//        numbers.joinToString("").length == 20 -> "Клейкая"
//        (numbers.maxOrNull() ?: 0) < -10 -> "Отрицательная"
//        (numbers.minOrNull() ?: 0) > 1000 -> "Положительная"
//        numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
//        else -> "Уникальная"
//    }

}

fun ff25(grades: List<Int>): List<Int> {
    /*
    Задача 25. Анализ учебных оценок
    Напиши функцию, которая принимает список чисел и возвращает список чисел.
    Пример данных: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.
    Вызывай методы обработки и фильтрации последовательно один из другого, чтобы результат предыдущего метода являлся
    основой для следующего.
     */
    val filteredGrades = grades.filter { it >= 60 }.sorted().take(3)
    return filteredGrades
}

fun ff26(furnitureList: List<String>): Map<Char, List<String>> {
    /*
    Задача 26. Создание каталога по первой букве
    Напиши функцию, которая принимает список строк и возвращает словарь с ключом - буквой и значением - списком строк.
    Начальные значения: val list = listOf(
    "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик",
    "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор",
    "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка",
    "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик",
    "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")
    Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве
    используя метод groupBy
     */
    var furnitureIndex: Map<Char, List<String>> = furnitureList.map {  it.lowercase() }. groupBy { it[0] }
    println(furnitureIndex)
    return furnitureIndex
}

fun ff27(furnitureList: List<String>) :String{
    /*
    Задание 27. Подсчёт средней длины слов в списке
    Напиши функцию, которая принимает список строк и возвращает строку.
    Начальные значения взять из предыдущей задачи.
    Цель: Перевести все слова в количество букв, подсчитать среднее значение. Вернуть форматированный текст с двумя
    знаками после запятой, используя функцию format и подходящий шаблон.
    */
    val averageLen: Double = furnitureList .map { it.length }.average()
    return String.format("Среднее количество букв в словах: %.2f", averageLen)
}

fun ff28(numbers: List<Int>): Map<String, List<Int>> {
    /*
    Задание 28: Категоризация чисел
    Напиши функцию, которая принимает список чисел и возвращает словарь с ключами - строками и значениями - список чисел.
    Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).
     */
    val groupedNumbers = numbers.distinct() .sortedDescending()
        .groupBy { number -> if (number % 2 == 0) "четные" else "нечетные"
        }
    return groupedNumbers
}

fun ff29(ages: List<Int?>, ageCheck: Int): Int?{
    /*
    Задание 29: Поиск первого подходящего элемента
    Напиши функцию, которая принимает список чисел и число и возвращает nullable число.
    Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60) и число для проверки возраста, например 18.
    Цель: Найти первый возраст в списке, который соответствует условию (больше второго аргумента) и вернуть его,
    либо null если значения не нашлось.
     */
    return ages.find { it != null && it > ageCheck}
}

fun main() {
    val numbers = listOf(-1, 2, -3, 4, 27, -5, 8, 264)
    ff01(numbers)

    val numbers2 = listOf(-1, 2, 2, 8, null, -3, null,  4, 27, -5, 8, 264)
    ff02(numbers2)

    val strList = listOf("Kotlin", "Java", null, null, "Python", "", "C++", "JavaScript", "Python")
    ffText03(strList)

    println("#24-------")
    //    •	Если коллекция пустая - “Пусто”
    ff24(mutableListOf<Int>())
    println()

    //    •	Если количество элементов меньше пяти - “Короткая”
    ff24(listOf(-1, 2, -3))
    println()

    //    •	Если коллекция начинается с 0 - “Стартовая”
    ff24(listOf(0, -1, 2, -3))
    println()

    //    •	Если сумма всех чисел больше 10000 - “Массивная”
    ff24(listOf(1, 10000))
    println()

    //    •	Если среднее значение равно 10 - “Сбалансированная”
    ff24(listOf(10, 10, 10))
    println()

    //    •	Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
    ff24(listOf(1234, 5678, 1234, 5678, 9999))
    println()

    //    •	Если максимальное число меньше -10 - “Отрицательная”
    ff24(listOf(-100))
    println()

    //    •	Если минимальное число больше 1000 - “Положительная”
    ff24(listOf(8000, 1001, 1002))
    println()

    //    •	Если содержит одновременно числа 3 и 14 - “Пи***тая”
    ff24(listOf(8000, 3, 1001, 14, 1002))

    //    •	Иначе - “Уникальная”
    ff24(numbers)

    println("---25")
    val grades =  mutableListOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    ff25(grades)

    println("---26")
    val furnitureList = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик",
        "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор",
        "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка",
        "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик",
        "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")
    ff26(furnitureList)

    println("---27")
    println(ff27(furnitureList))

    println("---28")
    val numbers28 = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(ff28(numbers28))

    println("---29")
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    val ageCheck = 18
    println(ff29(ages, ageCheck))
}