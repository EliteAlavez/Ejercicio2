package com.example.ejercicio2

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId
import java.time.temporal.ChronoUnit

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    val dateFormat = SimpleDateFormat("HH:mm")
    val personal = Personal(
        1,
        "Alberto Alavez",
        "Universidad",
        "VAAR9JR8U89593F",
        LocalDate.parse("2020-07-29"),
        "M",
        "ANNIR23O"
    )

    val horaEntrada = "10:00"
    val horaSalida =  "16:00"

    var dayOfWeek= LocalDate.now().dayOfWeek
    for (i in 1..100){
        dayOfWeek = dayOfWeek.plus(1)
        println("day Of Week: ${dayOfWeek}")
    }
    val timeBefore = LocalTime.parse("10:00")
    val timeNow = LocalTime.now(ZoneId.of("America/Mexico_City"))

    val minutes = timeBefore.until(timeNow, ChronoUnit.MINUTES)

    println("MIN: $minutes")
}



