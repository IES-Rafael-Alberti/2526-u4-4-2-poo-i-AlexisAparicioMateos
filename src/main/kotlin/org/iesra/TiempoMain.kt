package org.iesra

import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger("MainLogger")

fun leerInt(mensaje: String): Int? {
    print(mensaje)
    val input = readlnOrNull()
    return if (input.isNullOrBlank()) null else input.toInt()
}

fun crearTiempoPorTeclado(): Tiempo {
    val h = leerInt("Hora: ") ?: 0
    val m = leerInt("Minuto (opcional): ") ?: 0
    val s = leerInt("Segundo (opcional): ") ?: 0
    return Tiempo(h, m, s)
}

fun main() {

    logger.info("Introduce un tiempo:")
    val tiempo = crearTiempoPorTeclado()
    logger.info("Tiempo creado → $tiempo")

    logger.info("\nIntroduce un tiempo t:")
    val t = crearTiempoPorTeclado()
    logger.info("Tiempo t → $t")

    if (tiempo.incrementar(t))
        logger.info("Incrementado → $tiempo")
    else
        logger.warn("ERROR: se supera 23:59:59")

    if (tiempo.decrementar(t))
        logger.info("Decrementado → $tiempo")
    else
        logger.warn("ERROR: se baja de 00:00:00")

    val comp = tiempo.comparar(t)
    logger.info("Comparación → $comp")

    val copia = tiempo.copiar()
    logger.info("Copia → $copia")

    tiempo.copiar(t)
    logger.info("Copiado desde t → $tiempo")

    val suma = tiempo.sumar(t)
    logger.info("Suma → ${suma ?: "ERROR"}")

    val resta = tiempo.restar(t)
    logger.info("Resta → ${resta ?: "ERROR"}")

    logger.info("¿Tiempo > t? ${tiempo.esMayorQue(t)}")
    logger.info("¿Tiempo < t? ${tiempo.esMenorQue(t)}")
}
