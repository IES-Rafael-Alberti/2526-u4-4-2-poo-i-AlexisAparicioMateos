package org.iesra

fun leerInt(mensaje: String): Int? {
    print(mensaje)
    val input = readLine()
    return if (input.isNullOrBlank()) null else input.toInt()
}

fun crearTiempoPorTeclado(): Tiempo {
    val h = leerInt("Hora: ") ?: 0
    val m = leerInt("Minuto (opcional): ") ?: 0
    val s = leerInt("Segundo (opcional): ") ?: 0
    return Tiempo(h, m, s)
}

fun main() {

    println("Introduce un tiempo:")
    val tiempo = crearTiempoPorTeclado()
    println("Tiempo creado → $tiempo")

    println("\nIntroduce un tiempo t:")
    val t = crearTiempoPorTeclado()
    println("Tiempo t → $t")

    if (tiempo.incrementar(t))
        println("Incrementado → $tiempo")
    else
        println("ERROR: se supera 23:59:59")

    if (tiempo.decrementar(t))
        println("Decrementado → $tiempo")
    else
        println("ERROR: se baja de 00:00:00")

    val comp = tiempo.comparar(t)
    println("Comparación → $comp")

    val copia = tiempo.copiar()
    println("Copia → $copia")

    tiempo.copiar(t)
    println("Copiado desde t → $tiempo")

    val suma = tiempo.sumar(t)
    println("Suma → ${suma ?: "ERROR"}")

    val resta = tiempo.restar(t)
    println("Resta → ${resta ?: "ERROR"}")

    println("¿Tiempo > t? ${tiempo.esMayorQue(t)}")
    println("¿Tiempo < t? ${tiempo.esMenorQue(t)}")
}
