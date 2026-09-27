package org.lessons.org.lessons.lesson08.homeworks

fun allUpper(inString: String): String{
    /*
    7. Все слова с большой буквы
    Напишите метод, который преобразует строку из нескольких слов в строку, где каждое слово начинается с заглавной
    буквы а все остальные - строчные. Используй перебор, анализ символов и замену букв на заглавную с помощью метода
    uppercase() для конкретной буквы.
     */
    var outString: String = ""
    var prevSymbolIsChar: Boolean = false

    for (symbol in inString){
        if (symbol.isLetter()){
            if (prevSymbolIsChar){ // слово продолжается, делаем строчными все буквы, кроме первой
                outString = outString + symbol.lowercase()
            } else {
                outString = outString + symbol.uppercaseChar()
            }
            prevSymbolIsChar = true
        } else {
            outString = outString + symbol
            prevSymbolIsChar = false
            }
    }

    return outString
}

fun spyGame(inString: String, doEncrypt: Boolean = true): String{
    /*
    8. Игра в разведчика
    Напишите шифратор/дешифратор для строки. Шифровка производится путём замены двух соседних букв между собой: Kotlin
    шифруется в oKltni. Дешифровка выполняется аналогично.
    Если длина строки - нечётная, в конец добавляется символ пробела до начала шифрования. Таким образом все
    шифрованные сообщения будут с чётной длинной. Должно получиться два публичных метода: encrypt() и decrypt() которые
    принимают строку и печатают результат в консоль.
     */
    var outString: String = ""
    var stringToCode:String = inString
    val spaceChar: Char = ' '

    //add space in case od odd number of letters
    if (inString.length % 2 != 0) {
        stringToCode = "$inString$spaceChar"
    }

    for (i in 0 until (stringToCode.length - 1) step 2) {
        val first = stringToCode[i]
        val second = stringToCode[i + 1]
        outString = "$outString$second$first"
    }
    if (!doEncrypt && outString.lastOrNull() == spaceChar){
        outString = outString.dropLast(1)
    }
    println("==$outString==")
    return outString

}

fun timesTable(columnNum:Int, rowsNum:Int) {
    /*
    9. Таблица умножения
    Напишите функцию, которая принимает два числа и выводит таблицу умножения, у которой в заголовках столбцов и строк
    находятся перемножаемые числа, а в перекрестии заголовка и столбца - результат перемножения. Важно: каждый столбец
    должен быть выровнен по правому краю с помощью шаблона с форматированием строк. Размер форматирования каждой строки
    нужно вычислять динамически для каждого столбца. Результат должен быть похож на этот пример:
     */
    // add one for extra separator
    val maxMultiplicationResultSize: Int = (columnNum * rowsNum).toString().length + 1
    var multiplicationResultStr: String = ""
    var staffSpaces:String = ""
    var strToPrint:String = ""


    for (i in 0..columnNum){
        for (j in 0 .. rowsNum){
            when {
                (i == 0 && j != 0) -> multiplicationResultStr = j.toString() // заголовок
                (j == 0 && i != 0) -> multiplicationResultStr = i.toString() // крайняя слева колонка
                (j != 0 && i != 0) -> multiplicationResultStr = (i * j).toString() // результат умножения
            }

            if (multiplicationResultStr.length < maxMultiplicationResultSize){
                staffSpaces = " ".repeat(maxMultiplicationResultSize - multiplicationResultStr.length)
                strToPrint = "$staffSpaces$multiplicationResultStr"
            } else{
                strToPrint = multiplicationResultStr
            }
            print(strToPrint)
        }
        println()
    }

}

fun main() {
    println(allUpper("Котлин   - лучший язык программирования, да-да"))
    spyGame("Kotlin!")
    spyGame("oKltni !", false)
    timesTable(40, 30)
}