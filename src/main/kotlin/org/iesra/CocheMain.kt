package org.iesra

import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger("MainLogger")

fun main() {

    val coche1 = Coche("Nissan", "Micra", 95, 5, "3845KLM", "Rojo")
    val coche2 = Coche("Volkswagen", "Golf", 150, 5, "7291JRT", "Blanco")
    val coche3 = Coche("Toyota", "Corolla", 122, 5, "5812MNP", "Gris")
    val coche4 = Coche("BMW", "Serie1", 170, 3, "9034LZX", "Negro")
    val coche5 = Coche("Dacia", "Sandero", 90, 5, "1478HBC", "Azul")

    logger.info("---- COCHES CREADOS CORRECTAMENTE ----")
    logger.info("{}",coche1)
    logger.info("{}",coche2)
    logger.info("{}",coche3)
    logger.info("{}",coche4)
    logger.info("{}",coche5)

    logger.info("\n---- PRUEBAS DE ERRORES ----")

    try {
        Coche(null, "Civic", 120, 5, "1234ABC", "Blanco")
    } catch (e: IllegalArgumentException) {
        logger.warn("Error marca nula → ${e.message}")
    }

    try {
        Coche("Honda", "", 120, 5, "2345BCD", "Negro")
    } catch (e: IllegalArgumentException) {
        logger.warn("Error modelo vacío → ${e.message}")
    }

    try {
        Coche("Audi", "A3", 60, 5, "3456CDE", "Gris")
    } catch (e: IllegalArgumentException) {
        logger.warn("Error caballos bajos → ${e.message}")
    }

    try {
        Coche("Audi", "RS6", 720, 5, "4567DEF", "Rojo")
    } catch (e: IllegalArgumentException) {
        logger.warn("Error caballos altos → ${e.message}")
    }

    try {
        Coche("Mercedes", "ClaseA", 150, 2, "5678EFG", "Negro")
    } catch (e: IllegalArgumentException) {
        logger.warn("Error puertas bajas → ${e.message}")
    }

    try {
        Coche("Mercedes", "ClaseA", 150, 6, "6789FGH", "Negro")
    } catch (e: IllegalArgumentException) {
        logger.warn("Error puertas altas → ${e.message}")
    }

    try {
        Coche("Opel", "Corsa", 100, 5, "12AB", "Verde")
    } catch (e: IllegalArgumentException) {
        logger.warn("Error matrícula → ${e.message}")
    }

    try {
        coche1.color = null
    } catch (e: IllegalArgumentException) {
        logger.warn("Error color nulo → ${e.message}")
    }
}

