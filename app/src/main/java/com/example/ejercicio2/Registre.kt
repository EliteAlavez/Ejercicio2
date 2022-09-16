package com.example.ejercicio2

import java.time.LocalDateTime
import java.time.LocalTime

data class Registre(
    val horaEntrada: LocalDateTime,
    val horaSalida: LocalTime,
    val permiso: Boolean,
    val asistencia: Boolean
)
