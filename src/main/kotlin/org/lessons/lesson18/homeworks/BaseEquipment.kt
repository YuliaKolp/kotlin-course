package org.lessons.org.lessons.lesson18.homeworks

package lessons.lesson18.homeworks

// Задача 2. Базовый абстрактный класс для включаемого оборудования
abstract class PoweredEquipment : Powerable {
    var isPowered: Boolean = false
        protected set

    override fun powerOn() {
        isPowered = true
        println("${this.javaClass.simpleName}: Питание включено.")
    }

    override fun powerOff() {
        isPowered = false
        println("${this.javaClass.simpleName}: Питание выключено.")
    }
}

// Задача 3. Программируемое оборудование (наследуется от PoweredEquipment)
abstract class ProgrammableEquipment : PoweredEquipment(), Programmable {
    protected var currentAction: String = "Нет программы"

    override fun programAction(action: String) {
        if (!isPowered) {
            println("${this.javaClass.simpleName}: Ошибка! Невозможно задать режим работы: устройство выключено.")
            return
        }
        currentAction = action
        println("${this.javaClass.simpleName}: Запрограммировано действие -> $currentAction")
    }

    override fun execute() {
        if (!isPowered) {
            println("${this.javaClass.simpleName}: Ошибка! Невозможно выполнить программу: устройство выключено.")
            return
        }
        println("${this.javaClass.simpleName}: Выполняется программа -> $currentAction")
    }
}

// Задача 4. Оборудование с регулировкой температуры и открыванием (наследуется от ProgrammableEquipment)
abstract class ThermoOpenableEquipment : ProgrammableEquipment(), TemperatureRegulatable, Openable {
    var currentTemperature: Int = 0
        protected set

    var isOpen: Boolean = false
        protected set

    override fun setTemperature(temp: Int) {
        if (!isPowered) {
            println("${this.javaClass.simpleName}: Ошибка! Невозможно установить температуру: устройство выключено.")
            return
        }
        if (temp > maxTemperature) {
            println("${this.javaClass.simpleName}: Ошибка! Превышена максимальная температура ($maxTemperature°C).")
            return
        }
        currentTemperature = temp
        println("${this.javaClass.simpleName}: Установлена температура $currentTemperature°C")
    }

    override fun open() {
        isOpen = true
        println("${this.javaClass.simpleName}: Дверца открыта.")
    }

    override fun close() {
        isOpen = false
        println("${this.javaClass.simpleName}: Дверца закрыта.")
    }
}
