package org.iesra

fun Persona.saludar(): String {
    return "Hola, me llamo $nombre"
}

fun Persona.alturaEncimaMedia(): Boolean {
    return altura >= 1.75
}

fun Persona.pesoEncimaMedia(): Boolean {
    return peso >= 70
}

internal fun Persona.obtenerDescImc(): String {
    return when {
        imc < 18.5 -> "peso insuficiente"
        imc < 25.0 -> "peso saludable"
        imc < 30.0 -> "sobrepeso"
        else -> "obesidad"
    }
}

fun Persona.obtenerDesc(): String {
    val descAltura = if (alturaEncimaMedia())
        "Por encima de la media"
    else
        "Por debajo de la media"

    val descPeso = if (pesoEncimaMedia())
        "Por encima de la media"
    else
        "Por debajo de la media"

    return "$nombre con una altura de ${"%.2f".format(altura)}m ($descAltura) " +
            "y un peso ${"%.1f".format(peso)}kg ($descPeso) " +
            "tiene un IMC de ${"%.2f".format(imc)} (${obtenerDescImc()})"
}
