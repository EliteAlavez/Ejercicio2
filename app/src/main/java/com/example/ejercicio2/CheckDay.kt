package com.example.ejercicio2

import java.time.LocalDate
import java.time.LocalTime

data class CheckDay(
    val entry: LocalTime,
    val exit: LocalTime,
    val date: LocalDate
)
