package org.lessons.org.lessons.lesson10.homeworks

fun mapInAction() {
    /*
    Задачи на работу со словарём
     */
    // 1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val emptyMap: MutableMap<Int, Int> = mutableMapOf()

    // 2. Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float,
    // а значения - double
    val keyFlValDblMap: Map<Float, Double> = mapOf(
        1.0f to 10.0,
        2.0f to 20.0,
        3.0f to 30.0
    )

    // 3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val keyIntValStringMap: MutableMap<Int, String> = mutableMapOf(
        0 to "zero",
        1 to "one",
        2 to "two")

    // 4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    keyIntValStringMap[3] = "three"

    // 5. Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с
    // ключом, которого в словаре нет.
    println("#5--------------------------------")
    println(keyIntValStringMap[2])
    println(keyIntValStringMap[22])

    // 6. Удалите определенный элемент из изменяемого словаря по его ключу.
    keyIntValStringMap.remove(11)
    println("#6--------------------------------")
    println(keyIntValStringMap)


    // 7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь
    // обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    println("#7--------------------------------")
    val keyDblValFltMap: MutableMap<Double, Float> = mutableMapOf(
        11.0 to 11.1f,
        22.0 to 22.2f,
        10.0 to 0.0f,
        33.0 to 33.3f)
    for ((key, value ) in keyDblValFltMap){
        if (value != 0.0f) {
            println("$key / $value = ${key/value}")
        }
        else {
            println("бесконечность")
        }
    }

    //8.	Измените значение для существующего ключа в изменяемом словаре.
    keyDblValFltMap[33.0] = 333.3f
    println("#8--------------------------------")
    println(keyDblValFltMap)

    //9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val mapToJoin91: MutableMap<Int, String> = mutableMapOf(
        0 to "zero",
        1 to "one",
        2 to "two")

    val mapToJoin92: MutableMap<Int, String> = mutableMapOf(
        10 to "ten",
        11 to "eleven",
        9 to "nine",
        2 to "TWO")

    var mapToJoin93: MutableMap<Int, String> = mutableMapOf()
    println("#9--------------------------------")
    for ((key, value ) in mapToJoin91) {
        mapToJoin93[key] = value
    }
    for ((key, value ) in mapToJoin92) {
        if (key in mapToJoin93.keys) {
            println("WARNING!!! Maps to join share key = '$key'. Value from the 1st map is overridden with the value from the 2nd map")
        }
        mapToJoin93[key] = value
    }
    println(mapToJoin93)

    // 10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
    // Добавьте несколько элементов в этот словарь.
    val nestedMap: MutableMap<String, MutableList<Int>> = mutableMapOf(
        "prime numbers" to mutableListOf(1, 3, 5),
        "even numbers" to mutableListOf(2, 4, 6, 8),
        "odd numbers" to mutableListOf(9, 15, 21, 25, 27),
    )
    nestedMap["negative numbers"] = mutableListOf(-1, -8)
    nestedMap["negative numbers"]?.add(-13)
    println("#10--------------------------------")
    println(nestedMap)

    // 11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в
    // словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
    // Распечатай полученное множество.
    val nestedMap11: MutableMap<Int, MutableList<String>> = mutableMapOf(
        1 to mutableListOf("apple", "pear", "cherry", "plum"),
        2 to mutableListOf("Kotlin", "Java", "Scala"),
        3 to mutableListOf("chair"),
    )
    nestedMap11[3]?.add("table")
    println("#11--------------------------------")
    println(nestedMap11)

    //12. Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать
    // цифру 5 в качестве первого или второго значения.
    println("#12--------------------------------")
    val pairMap12: Map<Pair<Int, Int>, String> = mapOf(
        Pair(1, 2) to "one two",
        Pair(5, 3) to "five three",
        Pair(4, 5) to "four five",
        Pair(5, 5) to "five five"
    )
    for ((keyPair, value) in pairMap12){
        if (keyPair.first == 5 || keyPair.second == 5){
            println("Pair key is '$keyPair', value is '$value'")
        }
    }

}

fun bestMapType() {
    /*
    Задачи на подбор оптимального типа для словаря
     */
    //1.	Словарь библиотека: Ключи - автор книги, значения - список книг
    val library: MutableMap<String, MutableList<String>> = mutableMapOf(
        "Tolstoy" to mutableListOf("Anna K"),
        "Chekhov" to mutableListOf("The Cherry Orchard", "Ward No. 6")
    )

    //2. Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val plants: MutableMap<String, MutableList<String>> = mutableMapOf(
        "trees" to mutableListOf("ash", "pine"),
        "flowers" to mutableListOf("lilly", "rose")
    )

    // 3. Четверть финала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val final: MutableMap<String, MutableList<String>> = mutableMapOf(
        "dream team" to mutableListOf("Superman", "Batman"),
    )

    // 4. Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val remedy: MutableMap<String, MutableList<String>> = mutableMapOf(
        "01.01.2026" to mutableListOf("sport", "walking", "fruits"),
    )

    // 5. Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val travelGuide: MutableMap<String, MutableMap<String, MutableList<String>>> = mutableMapOf(
        "Great Britain" to mutableMapOf("London" to mutableListOf("Big Ben", "Tower")),
    )

}

fun main() {
    mapInAction()
    bestMapType()
}