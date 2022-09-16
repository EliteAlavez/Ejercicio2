package com.example.ejercicio2

import java.time.LocalDate

data class Permiso(
    val personal: String,
    val dia: String,
    val Fecha: LocalDate,
    val razon: String,
    val registro: String
)
val currentMonth = LocalDate.now().monthValue
val currentDay

