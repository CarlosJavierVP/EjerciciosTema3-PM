package com.example.ejerciciostema3.ejercicio2

class Cuenta (){

    lateinit var numeroCuenta : String
    lateinit var propietario : Persona
    var saldo : Double = 0.0

    fun transaccion (cantidad : Double, tipoTransaccion : String) : String{
        var result : String =""
        if (tipoTransaccion == "ingreso"){
            saldo += cantidad
            result ="Realizado un $tipoTransaccion de $cantidad€, saldo actual: $saldo€"
        }else if (tipoTransaccion == "reintegro"){
            if (saldo - cantidad < 0){
                result ="No queda dinero en la cuenta"
            }else{
                saldo -= cantidad
                result ="Realizado un $tipoTransaccion de $cantidad€, saldo actual: $saldo€"
            }
        }

        return result
    }
    override fun toString(): String {
        return "Cuenta(numeroCuenta='$numeroCuenta', propietario=$propietario, saldo='$saldo')"
    }


}