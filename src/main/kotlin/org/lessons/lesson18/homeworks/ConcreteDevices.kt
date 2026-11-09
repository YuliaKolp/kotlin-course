package org.lessons.org.lessons.lesson18.homeworks


// Холодильник
class Refrigerator : ThermoOpenableEquipment() {
    override val maxTemperature: Int = 10 // Максимальная температура для охлаждения
}

// Стиральная машина
class WashingMachine : ThermoOpenableEquipment(), WaterConnection, Drainable {
    override val maxTemperature: Int = 90

    override fun connectToWaterSupply() {
        println("Стиральная машина: Подключено к водопроводу.")
    }

    override fun getWater(amount: Int) {
        println("Стиральная machine: Набрано $amount л воды.")
    }

    override fun connectToDrain() {
        println("Стиральная машина: Подключено к сливу.")
    }

    override fun drain() {
        println("Стиральная машина: Вода слита в дренаж.")
    }
}

// Чайник
class Kettle : ThermoOpenableEquipment(), WaterContainer {
    override val maxTemperature: Int = 100
    override val capacity: Int = 2 // 2 литра

    override fun fillWater(amount: Int) {
        println("Чайник: Налито $amount мл воды.")
    }

    override fun getWater(amount: Int) {
        println("Чайник: Вылито $amount мл воды.")
    }
}

// Духовка
class Oven : ThermoOpenableEquipment(), Timable {
    override val maxTemperature: Int = 250

    override fun setTimer(time: Int) {
        if (!isPowered) {
            println("Духовка: Ошибка! Нельзя поставить таймер: питание выключено.")
            return
        }
        println("Духовка: Таймер установлен на $time минут.")
    }
}
