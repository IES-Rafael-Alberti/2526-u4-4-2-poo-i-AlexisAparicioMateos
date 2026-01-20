import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger("MainLogger")


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
    logger.info(infoRectangulo)

    val area = rectangulo.area()
    logger.info("Area rectángulo: $area")

    val perimetro = rectangulo.perimetro()
    logger.info("Perimetro rectángulo: $perimetro")

}