package org.iesra

class Persona (
    var peso: Double,
    var altura: Double,

) {
    var nombre: String = ""

    val imc: Double
        get() = peso / (altura * altura)

    init{
        require(peso > 0){"El peso tiene que ser mayor que 0"}
        require(altura > 0){"La altura tiene que ser mayor que 0"}
    }

    constructor(peso: Double, altura: Double, nombre: String) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', peso=$peso, altura=$altura, imc=${"%.2f".format(imc)})"
    }





}