package org.example.org.example.lesson04.homework


import java.math.BigDecimal
import java.math.BigInteger

val v1: Int = 42
val v2: Long = 98765432123456789L
val v3: Float = 23.45f
val v4: Double = 0.123456789
val v5: String = "Kotlin & Java"

// Ошибка в синтаксисе. Логический тип пишется строчными буквами (false/true), а не верхним регистром
// Должно быть: val v6: Boolean = false
// val v6 = FALSE

val v7: Char = 'c'
val v8: Int = 500
val v9: Long = 4294967296L
val v10: Float = 18.0f
val v11: Double = -0.001
val v12: String = "OpenAI"
val v13: String = "true"
val v14: List<Int> = listOf(3, 14)
val v15: Char = '9'
val v16: Int = 2048
val v17: Long = 10000000000L
val v18: Set<String> = setOf("OpenAI", "Quantum Computing")
val v19: Float = 5.75f

// Ошибка в синтаксисе. Использован неверный тип кавычек. Для строки нужны кавычки-лапки. Обратные кавычки используются
// для имен переменных, содержащих спецсимволы, а не для создания значений.
// Должно быть: val v20: Boolean = "1.414"
// val v20 = `1.414`

val v21: String = "Artificial Intelligence"
val v22: Array<Any> = arrayOf('x', "A")
val v23: String = "Android Studio"
val v24: Char = '@'
val v25: Int = 1024
val v26: Long = 1234567890123L
val v27: Float = 10.01f
val v28: Double = -273.15
val v29: String = "SpaceX"

// Ошибка в синтаксисе. Логический тип пишется строчными буквами (false/true), а не верхним регистром
// Должно быть: val v30: Boolean = false
// val v30 = FALSE

val v31: Double = 0.007

// Ошибка в синтаксисе. Использован неверный тип кавычек. Тк эмози может состоять из нескольких символов юникода, лучше
// для перемнной брать тип String, а для строки нужны кавычки-лапки
// Должно быть: val v32: String = "🤯"
// val v32 = “🤯”

val v33: Map<String, Int> = mapOf("true" to 2, "false" to 34)

// Ошибка в синтаксисе. Использован неверный тип кавычек. Значение переменной содержит более 1го символа, поэтому нужен
// тип String. Для строки нужны кавычки-лапки.
// Должно быть: val v34: String = "65535"
// val v34 = ‘65535’

val v35: Long = 72057594037927935L
val v36: Float = 2.71828f
val v37: Double = 101.0101
val v38: String = "Quantum Computing"
val v39: Map<Int, String> = mapOf(2 to "true", 34 to "false")
val v40: Char = 'x'
val v41: Int = 314
val v42: Long = 123456789123456789L
val v43: Float = 6.626f

// Ошибка в синтаксисе. Логический тип пишется строчными буквами (false/true), а не верхним регистром
// Должно быть: val v44: Boolean = true
// val v44 = TRUE

////////////////////////////////////////////////////////////////////

//Подбери подходящий тип который будет:

//1. Хранить букву, на которую указывает палец медиума во время спиритического сеанса.
val magicLetter: Char = 'А'

//2. Хранить количество ложек сахара, которые я кладу в одну чашку чая.
val sugarSpoonsNum: Byte = 0

//3. Хранить список расходов на доставку еды, чтобы ещё раз убедиться, что готовить было дешевле.
val foodDeliveryExpenses: List<Double> = listOf(1230.45, 560.0)

//4. Хранить длину очереди в столовой до миллиардной доли сантиметра.
val canteenQueueLen: BigDecimal = BigDecimal("0.0000000000001")

//5. Хранить факт, закрыт ли баг после того, как его просто переименовали в фичу.
val isBugClosedAsFeature: Boolean = true

//6. Хранить количество свистков чайника за день.
val kettleWhistlesPerDayNum: Int = 0

//7. Хранить количество нажатий котом на клавиатуру ноутбука за всё время твоей работы.
val catButtonClickNum: Int = 0

//8. Хранить количество попыток пересчитать звёзды на небе за всю историю человечества.
val starCountAttemptNum: BigInteger = BigInteger("0")

//9. Хранить массу воздуха в спускающем матрасе после нападения кота в долях грамма.
val deflatingMattressAirMass: Float = 0.0f

//10. Хранить словарь «название стартапа → сумму потерь инвесторов».
val startupInvestorLoss: Map<String, Double> = mapOf(
    "startup_A" to 0.0, "startup_B" to 0.0)

//11. Хранить строку «починилось само», чтобы закрывать тикеты без лишних слов.
val ticketClosureReason: String = "починилось само"

//12. Хранить список тем для митингов, которые на самом деле никому не нужны.
val uselessMeetingTopics: List<String> = listOf(
    "тема №1","тема №2")