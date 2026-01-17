fun main () {
    val rectangulo1 = Rectangulo(2.2, 3.1)
    val rectangulo2 = Rectangulo(2.3, 4.5)
    val rectangulo3 = Rectangulo(5.2, 7.1)
    val rectangulo4 = Rectangulo(6.7, 8.4)

    mostrarInfoRectangulo(rectangulo1)
    mostrarInfoRectangulo(rectangulo2)
    mostrarInfoRectangulo(rectangulo3)
    mostrarInfoRectangulo(rectangulo4)
}

fun mostrarInfoRectangulo (rectangulo: Rectangulo) {
    val infoRectangulo = rectangulo.toString()
    println(infoRectangulo)

    val area = rectangulo.area()
    println("Area rectángulo: $area")

    val perimetro = rectangulo.perimetro()
    println("Perimetro rectángulo: $perimetro")

    println()
}