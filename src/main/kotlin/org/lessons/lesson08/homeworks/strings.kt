package org.lessons.org.lessons.lesson08.homeworks

fun stringConversion(inString: String): String {
    /*
    1. Преобразование строк
    Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая
    текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и соответственно
    изменять фразу.

    Правила проверки и преобразования:

    Если фраза содержит слово "невозможно":
    Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".

    Если фраза начинается с "Я не уверен":
    Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".

    Если фраза содержит слово "катастрофа":
    Преобразование: Замените "катастрофа" на "интересное событие".

    Если фраза заканчивается на "без проблем":
    Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".

    Если фраза содержит только одно слово:
    Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".

    Примеры Тестовых Фраз:
    "Это невозможно выполнить за один день"
    "Я не уверен в успехе этого проекта"
    "Произошла катастрофа на сервере"
    "Этот код работает без проблем"
    "Удача"
     */
    var outString: String = inString
    outString = inString.replace("невозможно", "совершенно точно возможно, просто требует времени")
    outString = outString.replace("катастрофа", "интересное событие")

    if (outString.startsWith("Я не уверен")) {
        outString += ", но моя интуиция говорит об обратном"
    }

    val endString = "без проблем"
    if (outString.endsWith(endString)) {
        val endIndex = outString.lastIndexOf(endString)
        outString = "${outString.subSequence(0, endIndex)}с парой интересных вызовов на пути"
    }

    val space = ' '
    if (!outString.contains(space)) {
        outString = "Иногда, ${outString.lowercase()}, но не всегда"
    }

    return outString
}

fun getLogEntryTime(logEntry: String): List<String> {
    /*
    2. Извлечение даты из строки лога
    У вас есть строка лога, например "Пользователь вошел в систему -> 2021-12-01 09:48:23" (данные могут быть любыми,
    но формат всегда такой). Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.
    Используй indexOf или split для получения правой части сообщения.
     */
    val logSeparator = " -> "
    val logEntryDateTime = logEntry.substringAfter(logSeparator).split(" ")
    return logEntryDateTime
}

fun maskValue(cardNum: String): String {
    /*
    3. Маскирование личных данных
    Дана строка с номером кредитной карты, например "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних
    четырех, символами "*".
     */
    val maskSymbol: Char = '*'
    val spaceSeparator = ' '
    var maskedNum: String = ""
//    val numParts: List<String> = cardNum.split(spaceSeparator)
//    val lastNumsIndex = numParts.size - 1
//    var i:Int = 0
//    while (i < lastNumsIndex){
//        for (char in numParts[i]){
//            maskedNum += maskSymbol
//        }
//        maskedNum += spaceSeparator
//        i += 1
//    }
//    maskedNum += numParts[lastNumsIndex]
//
//    return maskedNum


    // Вычисляем индекс, начиная с которого символы трогать нельзя
    val openStartIndex = cardNum.length - 4


    maskedNum = cardNum.mapIndexed { index, char ->
        // Пробелы оставляем пробелами, последние 4 символа не трогаем, остальное — в '*'
        if (char == spaceSeparator || index >= openStartIndex) char else maskSymbol
    }.joinToString("")

    return maskedNum
}

fun formatEmail(inEmail: String): String {
    /*
    4. Форматирование адреса электронной почты.
    У вас есть электронный адрес, например "username@example.com". Преобразуйте его в строку
    "username [at] example [dot] com", используя функцию replace()
     */
    return inEmail.replace("@", " [at] ").replace(".", " [dot] ")
}

fun getFileName(filePath: String): String {
    /*
    5. Извлечение имени файла из пути.
    Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme" (может быть
    любым). Извлеките название файла с расширением.
    */
    return (filePath.split('/').last())
}

fun getAbbreviation(phrase: String):String {
    /*
    6. Создание аббревиатуры из фразы.
    У вас есть фраза, например "Котлин лучший язык программирования" (может быть любой с разделителями слов - пробел).
    Создайте аббревиатуру из начальных букв слов (например, "ООП").
    Используйте split. Используйте for для перебора слов. Используйте var переменную для накопления первых букв.
     */
    var abbreviation:String = "" // если StringBuilder() то можно append
    val spaceChar: Char = ' '
    var firstSymbol: Char
    for (word in phrase.split(spaceChar)){
        // Проверка на случай двойных пробелов
        if (word.isNotEmpty()){
            firstSymbol = word[0]
            if (firstSymbol.isLetter()){
                abbreviation = "$abbreviation${firstSymbol.uppercase()}"
            }
        }

//        return phrase.split(" ")
//            .filter { it.isNotEmpty() && it[0].isLetter() } // Убираем пустые слова и берем только те, что начинаются с букв
//            .map { it[0].uppercase() }                     // Берем первую букву каждого слова и переводим в верхний регистр
//            .joinToString("")
    }
    return abbreviation
}
fun main() {

    val testStrings: Array<String> = arrayOf(
        "Это невозможно выполнить за один день",
        "Я не уверен в успехе этого проекта",
        "Произошла катастрофа на сервере",
        "Этот код работает без проблем",
        "Удача",
    )
    for (testString in testStrings){
        println(stringConversion(testString))
    }
    println(getLogEntryTime("Пользователь вошел в систему -> 2021-12-01 09:48:23"))
    println(maskValue("4539 1488 0343 6467"))
    println(formatEmail("username@example.com"))
    println(getFileName("C:/Пользователи/Документы/report.txt"))
    println(getAbbreviation("Котлин   - лучший язык программирования"))

}