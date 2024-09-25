package com.example.ejerciciostema3.ejercicio3

class ProductoFresco (numLote : Long, fechaCaducidad: String, var fechaEnvasado : String, var origen : String) {

    override fun toString(): String {
        return super.toString()+"==> ProductoFresco(fechaEnvasado='$fechaEnvasado', origen='$origen')"
    }
}