package org.iesra

class Tiempo {

    var hora: Int = 0
        private set
    var minuto: Int = 0
        private set
    var segundo: Int = 0
        private set

    constructor(hora: Int, minuto: Int, segundo: Int) {
        require(hora in 0..23) { "La hora debe estar entre 0 y 23" }

        val totalSegundos = hora * 3600 + minuto * 60 + segundo
        inicializarDesdeSegundos(totalSegundos)
    }

    constructor(hora: Int, minuto: Int) : this(hora, minuto, 0)
    constructor(hora: Int) : this(hora, 0, 0)

    private fun inicializarDesdeSegundos(total: Int) {
        require(total in 0..86399) { "Tiempo fuera de rango" }

        hora = total / 3600
        minuto = (total % 3600) / 60
        segundo = total % 60
    }

    private fun totalSegundos(): Int =
        hora * 3600 + minuto * 60 + segundo

    override fun toString(): String =
        "%02dh %02dm %02ds".format(hora, minuto, segundo)

    fun incrementar(t: Tiempo): Boolean {
        val nuevoTotal = totalSegundos() + t.totalSegundos()
        if (nuevoTotal > 86399) return false

        inicializarDesdeSegundos(nuevoTotal)
        return true
    }

    fun decrementar(t: Tiempo): Boolean {
        val nuevoTotal = totalSegundos() - t.totalSegundos()
        if (nuevoTotal < 0) return false

        inicializarDesdeSegundos(nuevoTotal)
        return true
    }

    fun comparar(t: Tiempo): Int =
        when {
            totalSegundos() < t.totalSegundos() -> -1
            totalSegundos() > t.totalSegundos() -> 1
            else -> 0
        }

    fun copiar(): Tiempo =
        Tiempo(hora, minuto, segundo)

    fun copiar(t: Tiempo): Tiempo {
        inicializarDesdeSegundos(t.totalSegundos())
        return this
    }

    fun sumar(t: Tiempo): Tiempo? {
        val total = totalSegundos() + t.totalSegundos()
        return if (total > 86399) null else Tiempo(0, 0, total)
    }

    fun restar(t: Tiempo): Tiempo? {
        val total = totalSegundos() - t.totalSegundos()
        return if (total < 0) null else Tiempo(0, 0, total)
    }

    fun esMayorQue(t: Tiempo): Boolean =
        totalSegundos() > t.totalSegundos()

    fun esMenorQue(t: Tiempo): Boolean =
        totalSegundos() < t.totalSegundos()
}
