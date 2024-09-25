package com.example.ejerciciostema3.ejercicio3

class ProductoCongelado (numLote : Long, fechaCaducidad: String, var tempRecomendada : Int) : Producto(fechaCaducidad, numLote) {

    override fun toString(): String {
        return "${super.toString()} ==> ProductoCongelado (temperatura de congelación recomendada: $tempRecomendada)"
    }
}