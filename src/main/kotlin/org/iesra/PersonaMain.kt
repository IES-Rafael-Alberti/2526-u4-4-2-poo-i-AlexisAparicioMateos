package org.iesra

import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger("MainLogger")

fun main() {

    val persona1 = Persona(70.0, 1.75)
    val persona2 = Persona(64.0, 1.65, "Alexis")
    val persona3 = Persona(68.0, 1.68, "Arantxa")

    logger.info("{}",persona1)
    logger.info("{}",persona2)
    logger.info("{}",persona3)

    logger.info("\nIntroduce el nombre de la persona 1:")
    var nombreIntroducido: String

    do {
        nombreIntroducido = readLine()?.trim() ?: ""
    } while (nombreIntroducido.isEmpty())

    persona1.nombre = nombreIntroducido

    logger.info("Persona 1 -> Nombre: ${persona1.nombre}, Peso: ${persona1.peso}, Altura: ${persona1.altura}")

    logger.info("\nPersona 3 antes del cambio:")
    logger.info("Peso: ${persona3.peso}, Altura: ${persona3.altura}, IMC: ${"%.2f".format(persona3.imc)}")

    persona3.altura = 1.80

    logger.info("Persona 3 después del cambio:")
    logger.info("Peso: ${persona3.peso}, Altura: ${persona3.altura}, IMC: ${"%.2f".format(persona3.imc)}")

    persona2.altura = persona3.altura

    logger.info("\nPersona 2:")
    logger.info("{}",persona2)

    logger.info("Persona 3:")
    logger.info("{}",persona3)

    val sonIguales = persona2 == persona3
    logger.info("\n¿Persona 2 y Persona 3 son iguales? $sonIguales")

    val personas = listOf(
        Persona(64.7, 1.72, "Julia"),
        Persona(85.0, 1.82, "Carlos"),
        Persona(55.0, 1.60, "Laura"),
        Persona(92.3, 1.75, "Miguel"),
        Persona(70.0, 1.78, "Ana")
    )

    for (persona in personas) {
        logger.info(persona.saludar())
        logger.info(persona.obtenerDesc())
    }
}