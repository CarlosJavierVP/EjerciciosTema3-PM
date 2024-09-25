package com.example.ejerciciostema3.ejercicio1

class Humano (var nombre:String, edad:Byte) : SerVivo(edad){

    fun mayor(other: Humano) : Humano{
        var result : Humano = Humano(this.nombre, this.edad)

        if (other.edad == this.edad){
            if (other.nombre.length > this.nombre.length){
                result = Humano(other.nombre, other.edad)
            }
        }else if (other.edad > this.edad){
            result = Humano(other.nombre, other.edad)
        }

        return result
    }

    fun equals(other: Humano): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Humano

        return nombre == other.nombre
    }

    override fun toString(): String {
        return "Humano(nombre: '$nombre'"+super.toString()+")"
    }


}