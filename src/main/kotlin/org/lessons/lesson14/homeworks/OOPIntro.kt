package org.lessons.org.lessons.lesson14.homeworks

/*
Событие: вечеринка. Создайте класс Party, который описывает вечеринку.
У него должны быть свойства location (String) и attendees (Int).
Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.

Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию.
У него должно быть свойство type (String) и intensity (Int). Добавьте метод express(), который выводит описание эмоции
в зависимости от её типа и интенсивности.

Природное явление: луна. Создайте объект Moon, который будет представлять Луну.
Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент, и phase (String), чтобы
отображать текущую фазу Луны (например, "Full Moon", "New Moon").
Добавьте метод showPhase(), который выводит текущую фазу Луны.

Покупка: продукт. Создайте дата класс для продукта, который будет представлять продукт в магазине.
У него должны быть свойства “название”, “цена”, “количество”.

Мероприятие: концерт. Создайте класс, который будет представлять концерт.
У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”. Также приватное поле
“проданные билеты”.
Добавьте метод, который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных
билетов на один.
 */

fun main() {

    val birthdayParty = Party("Пляжный клуб", 25)
    birthdayParty.details()
    birthdayParty.attendees = 30
    birthdayParty.details()

    val emotionExamle = Emotion("joy",10)
    emotionExamle.express()

    val moon = Moon(true, "Full Moon")
    moon.showPhase()

    val catPerformance = Сoncert("Super cats", "roof", 750.5f, 100, 0)
    catPerformance.getConcertInfo()
    println("Продано билетов: ${catPerformance.getSoldTickets()}")
    catPerformance.buyTicket()
    catPerformance.getConcertInfo()
    println("Продано билетов: ${catPerformance.getSoldTickets()}")
}