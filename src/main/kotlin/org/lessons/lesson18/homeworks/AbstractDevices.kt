package org.lessons.org.lessons.lesson18.homeworks



// Холодильник
abstract class RefrigeratorDevice : Powerable, Openable, TemperatureRegulatable

// Стиральная машина
abstract class WashingMachineDevice : Powerable, Openable, WaterConnection, Drainable, Programmable

// Умная лампа
abstract class SmartLampDevice : Powerable, LightEmitting, Programmable

// Электронные часы
abstract class ElectronicClockDevice : Powerable, Timable, SoundEmitting

// Робот-пылесос
abstract class RobotVacuumDevice : Powerable, Movable, Cleanable, Rechargeable

// Механические часы
abstract class MechanicalClockDevice : Mechanical, Timable

// Фонарик
abstract class FlashlightDevice : Powerable, LightEmitting, BatteryOperated

// Кофемашина
abstract class CoffeeMachineDevice : Powerable, WaterContainer, Programmable

// Умная колонка
abstract class SmartSpeakerDevice : Powerable, SoundEmitting, Programmable
