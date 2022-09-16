package com.example.ejercicio2

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

data class Permission constructor(
    val employee: Employee,
    val date: LocalDate,
    val justification: String
)

class OtherPermission(){
    lateinit var employee: Employee
    @RequiresApi(Build.VERSION_CODES.O)
    fun init(){
        employee = Employee(id=1,
        fullName = "AAA", AcademicLevel.DOCTORAL,
        curp = "AAAAA999101HOCRMSDA2",
        dateOfAdmission = LocalDate.parse("2022-09-13"),
        budgetKey = "AAA"
        )
    }
    fun setEmplelado(
        employee: Employee{
            this.employee
        }
    )
}
