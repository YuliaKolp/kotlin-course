package org.lessons.org.lessons.lesson17.homeworks


/*
Игровой автомат
Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и методов (аргументы и
возвращаемые значения), включая модификаторы доступа (private для приватных)

Поля:
цвет
модель
включен
ОС загружена
список установленных игр
наличие джойстика
баланс вырученных средств
владелец
телефон поддержки.
игровой сеанс оплачен
стоимость одного игрового сеанса
пин-код автомата
 */



class SlotMachine(
    val color: String,
    val model: String,
    val hasJoystick: Boolean,

    var owner: String,
    var supportPhone: String,
    var sessionCost: Double,

    private val pinCode: String) {
    var isTurnedOn: Boolean = false
        private set

    var isOsLoaded: Boolean = false
        private set

    var isSessionPaid: Boolean = false
        private set

    var totalRevenue: Double = 0.0
        private set

    private val _installedGames = mutableListOf<String>()
    val installedGames: List<String> get() = _installedGames


    // --- Методы автомата ---

    // Включение автомата и автоматическая загрузка ОС
    fun turnOn() { }

    // Выключение автомата
    fun turnOff() { }

    // Установка новой игры (требуется пин-код для безопасности)
    fun installGame(gameName: String, enteredPin: String): Boolean {
        return false
    }

    // Внесение денег для оплаты сессии
    fun insertMoney(amount: Double): Boolean {
        return false
    }

    // Запуск игры из списка установленных (возможен, только если сессия оплачена и ОС загружена)
    fun startGame(gameName: String): Boolean {
        return false
    }

    // Инкассация / снятие выручки (требуется пин-код, возвращает сумму)
    fun withdrawRevenue(enteredPin: String): Double {
        return 0.0
    }
}
