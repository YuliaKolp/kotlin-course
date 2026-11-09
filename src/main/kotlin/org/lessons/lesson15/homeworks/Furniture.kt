package org.lessons.org.lessons.lesson15.homeworks

/*
Иерархия Мебели
Базовый класс: Мебель
Производные классы: …
Дополнительное разветвление для …:
 */

open class Furniture (val material: String,
                      manufactureLocation: String,
                      val price: Int,
                      val quantity: Int,
                      weight: Float) {
}

open class Tables(legsNum:Int,
                  material: String,
                  manufactureLocation: String,
                  price: Int,
                  quantity: Int,
                  weight: Float
) : Furniture(material, manufactureLocation, price, quantity, weight) {

}