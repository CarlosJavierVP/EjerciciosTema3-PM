package com.example.ejerciciostema3.ejercicio3

class ProductoCongelado (numLote : Long, fechaCaducidad: String, var tempRecomendada : Int) {

    override fun toString(): String {
        return super.toString()+"==> ProductoCongelado(tempRecomendada=$tempRecomendada)"
    }
}