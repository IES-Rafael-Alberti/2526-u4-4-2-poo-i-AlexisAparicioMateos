package org.iesra

class Coche(
    marca: String?,
    modelo: String?,
    val caballos: Int?,
    val puertas: Int?,
    val matricula: String?,
    colorInicial: String?
) {

    val marca: String
    val modelo: String
    var color: String? = colorInicial
        set(value) {
            require(value != null) { "El color no puede ser nulo" }
            field = value
        }

    init {

        require(!marca.isNullOrBlank()) { "La marca no puede ser nula ni vacía" }
        this.marca = marca.replaceFirstChar { it.uppercase() }

        require(!modelo.isNullOrBlank()) { "El modelo no puede ser nulo ni vacío" }
        this.modelo = modelo.replaceFirstChar { it.uppercase() }

        require(caballos != null) { "Los caballos no pueden ser nulos" }
        require(caballos in 70..700) { "Los caballos deben estar entre 70 y 700" }

        require(puertas != null) { "El número de puertas no puede ser nulo" }
        require(puertas in 3..5) { "El número de puertas debe estar entre 3 y 5" }

        require(matricula != null) { "La matrícula no puede ser nula" }
        require(matricula.length == 7) { "La matrícula debe tener 7 caracteres" }

        require(colorInicial != null) { "El color no puede ser nulo" }
    }

    override fun toString(): String {
        return "Coche(marca='$marca', modelo='$modelo', caballos=$caballos, puertas=$puertas, matricula='$matricula', color='$color')"
    }
}
