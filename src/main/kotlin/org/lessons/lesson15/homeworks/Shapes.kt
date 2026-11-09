package org.lessons.org.lessons.lesson15.homeworks

/*
Геометрические Фигуры
Базовый класс: Геометрическая Фигура
Производные классы: Многоугольник, Круг
Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник
 */
open class Shapes {
}

open class Polygon(val sideNumber: Int): Shapes(){

}

class Circle(val radius: Int): Shapes(){

}

class Triangle(val side01: Int, val side02: Int, val side03: Int): Polygon(3){

}

class Rectangle(val width: Int, val length: Int): Polygon(4){

}