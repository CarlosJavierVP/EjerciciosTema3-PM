package com.example.ejerciciostema3.ejercicio1

open class SerVivo (var edad:Byte){


    fun equals(other: SerVivo): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SerVivo
        return edad == other.edad
    }

    fun mayor(other: SerVivo): SerVivo{
        var result : SerVivo = SerVivo(this.edad)
        if (other.edad > this.edad ){
            result = other
        }
        return result
    }

    override fun toString(): String {
        return " edad: "+this.edad+")"
    }



}