package com.example.ejerciciostema3.ejercicio3

class ProductoFresco (numLote : Long, fechaCaducidad: String, var fechaEnvasado : String, var origen : String) : Producto(fechaCaducidad,numLote) {

    override fun toString(): String {
        return "${super.toString()} ==> ProductoFresco (fecha de envasado: '$fechaEnvasado', origen: '$origen')"
    }
}