package org.lessons.org.lessons.lesson14.homeworks

/*
Мероприятие: концерт. Создайте класс, который будет представлять концерт.
У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”. Также приватное поле
“проданные билеты”.
Добавьте метод, который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных
билетов на один.
 */
class Сoncert (val band: String, val location: String, val cost: Float, val capacity: Int,
               private var soldTickets: Int){
    fun getConcertInfo() {
        println("группа '$band'”, “место проведения '$location'”, “стоимость '$cost'”, “вместимость зала '$capacity'")
    }

    fun buyTicket(){
        soldTickets += 1
    }

    fun getSoldTickets(): Int {
        return soldTickets
    }
}