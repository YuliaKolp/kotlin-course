package org.lessons.org.lessons.lesson17.homeworks

/*
Игровой автомат
Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)

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

Методы:
включить
выключить
загрузить ОС
завершить работу ОС
показать список игр
включить игру
оплатить игровой сеанс
забрать наличные с помощью пин-кода
открыть сейф и выдать наличные
 */

class MySlotMachine(val color: String,
                    val model: String,
                    val isJoystick: Boolean
    ){
    private var isOn: Boolean = false
    private var OSLoaded: Boolean = false
    private val gamesList: MutableList<String> =  mutableListOf("game 01", "game 02", "game 03")
    private var revenueBalance: Int = 0
    private var owner: String = ""
    var supportPhoneNum: String = ""
        private set
    private var gameSessionIsPaid: Boolean = false
    private var gameSessionPrice: Float = 0f
    private val PIN: String = "1234"

    fun turnOn(){
        if (loadOS()) {isOn = true}
    }

    fun turnOff() {
        if (shutDownOS()) {isOn = false}
    }

    private fun loadOS(): Boolean{
        OSLoaded = true
        return true
    }

    private fun shutDownOS(): Boolean{
        OSLoaded = false
        return true
    }

    fun showGameList() {
        println(gamesList)
    }

    fun startGame() {
        if (gameSessionIsPaid) { paySession()}
    }

    fun paySession(): Boolean{
        gameSessionIsPaid = true
        return gameSessionIsPaid
    }

    fun withdrawCash(providedPIN:String){
        if (providedPIN == PIN){
            openVault()
            revenueBalance = 0
            println("Cash is taken successfully")
        }
    }

    fun openVault(){

    }

}