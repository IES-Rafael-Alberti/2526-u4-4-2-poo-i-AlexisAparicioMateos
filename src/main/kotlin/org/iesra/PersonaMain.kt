package org.iesra

fun main() {

    val persona1 = Persona(70.0, 1.75)
    val persona2 = Persona(64.0, 1.65, "Alexis")
    val persona3 = Persona(68.0, 1.68, "Arantxa")

    println(persona1)
    println(persona2)
    println(persona3)

    println("\nIntroduce el nombre de la persona 1:")
    var nombreIntroducido: String

    do {
        nombreIntroducido = readLine()?.trim() ?: ""
    } while (nombreIntroducido.isEmpty())

    persona1.nombre = nombreIntroducido

    println("Persona 1 -> Nombre: ${persona1.nombre}, Peso: ${persona1.peso}, Altura: ${persona1.altura}")

    println("\nPersona 3 antes del cambio:")
    println("Peso: ${persona3.peso}, Altura: ${persona3.altura}, IMC: ${"%.2f".format(persona3.imc)}")

    persona3.altura = 1.80

    println("Persona 3 después del cambio:")
    println("Peso: ${persona3.peso}, Altura: ${persona3.altura}, IMC: ${"%.2f".format(persona3.imc)}")

    persona2.altura = persona3.altura

    println("\nPersona 2:")
    println(persona2)

    println("Persona 3:")
    println(persona3)

    val sonIguales = persona2 == persona3
    println("\n¿Persona 2 y Persona 3 son iguales? $sonIguales")
}
