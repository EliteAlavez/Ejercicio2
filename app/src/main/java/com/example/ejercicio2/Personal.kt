package com.example.ejercicio2

import java.time.LocalDate

data class Personal(
    val id: Int,
    val nombreCompleto: String,
    val degree: String,
    val curp: String,
    val dateAdmission: LocalDate,
    val genre: String,
    val budgetKey: String
)
