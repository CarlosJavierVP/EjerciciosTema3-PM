package com.example.ejerciciostema3.ejercicio3

class ProductoRefrigerado (numLote : Long, fechaCaducidad: String, var codSupervisionAlimentaria : Int) : Producto(fechaCaducidad,numLote) {

    override fun toString(): String {
        return  "${super.toString()} ==> ProductoRefrigerado (Código de supervisión alimentaria: $codSupervisionAlimentaria)"
    }
}