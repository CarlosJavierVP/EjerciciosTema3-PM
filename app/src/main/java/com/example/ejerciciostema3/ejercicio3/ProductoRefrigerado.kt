package com.example.ejerciciostema3.ejercicio3

class ProductoRefrigerado (numLote : Long, fechaCaducidad: String, var codSupervisionAlimentaria : Int) {

    override fun toString(): String {
        return  super.toString()+"==> ProductoRefrigerado(codSupervisionAlimentaria=$codSupervisionAlimentaria)"
    }
}