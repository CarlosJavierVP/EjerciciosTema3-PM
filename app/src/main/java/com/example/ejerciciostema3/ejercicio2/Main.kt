package com.example.ejerciciostema3.ejercicio2

fun main(){

    var persona1 = Persona("James","Holden","666777999")
    var cuenta1 = Cuenta()
    cuenta1.numeroCuenta = "ES9988000011112222"
    cuenta1.propietario = persona1
    cuenta1.saldo = 5000.0

    var persona2 = Persona("Monza","Murcatto","666999888")
    var cuenta2 = Cuenta()
    cuenta2.numeroCuenta = "IT7722000066669999"
    cuenta2.propietario = persona2
    cuenta2.saldo = 150525000.0

    cuenta1.transaccion(2500.0,"reintegro")
    cuenta1.transaccion(50.0,"ingreso")

    cuenta2.transaccion(1000000000.0,"reintegro")
    cuenta2.transaccion(9000000000.0,"ingreso")

    println("$persona1 |\n $cuenta1")
    println("$persona2 |\n $cuenta2")

}