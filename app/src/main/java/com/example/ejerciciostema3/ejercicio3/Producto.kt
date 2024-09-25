package com.example.ejerciciostema3.ejercicio3

open class Producto (var fechaCaducidad : String, var numLote : Long){

    override fun toString(): String {
        return "Producto (fechaCaducidad: '$fechaCaducidad', numLote: $numLote)"
    }
}