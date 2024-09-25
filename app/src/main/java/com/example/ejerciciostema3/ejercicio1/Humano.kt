package com.example.ejerciciostema3.ejercicio1

class Humano (var nombre:String) : SerVivo(4){


    fun equals(other: Humano): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Humano

        return nombre == other.nombre
    }

    override fun toString(): String {
        return "Humano(nombre='$nombre')"+super.toString()
    }


}