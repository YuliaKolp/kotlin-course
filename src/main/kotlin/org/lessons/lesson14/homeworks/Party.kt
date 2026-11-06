package org.lessons.org.lessons.lesson14.homeworks

/*
Событие: вечеринка. Создайте класс Party, который описывает вечеринку.
У него должны быть свойства location (String) и attendees (Int).
Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.
 */

class Party (val location: String, var attendees: Int){
    fun details(){
        println("Место проведения: $location. Количество гостей: $attendees")
    }
}