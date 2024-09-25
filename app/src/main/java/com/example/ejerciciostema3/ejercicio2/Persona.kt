package com.example.ejerciciostema3.ejercicio2

class Persona (var nombre: String, var apellido: String, telefono: String = "" ) {

    var telefono: String = telefono
        //para controlar la cantidad de dígitos del número de tlf, se utiliza el set ponerle una condición al atributo
        set(value) {
            field = if (value.length != 9) "000-000-000" else value
        }

    override fun toString(): String {
        return "Persona(nombre='$nombre', apellido='$apellido', telefono='$telefono')"
    }


}