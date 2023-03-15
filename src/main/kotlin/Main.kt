fun main() {

    val alcancia = Alcancia()

    var opcion: Int

    do {
        println(" Menú ")
        println("1. Agregar el valor de la moneda")
        println("2. Mostrar cantidad de cada moneda")
        println("3. Mostrar el total guardado en la alcancia")
        println("4. Vaciar la alcancía")
        println("5. Salir")

        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                println("Ingrese el valor de la moneda que puede ser 20, 50, 100, 200 o 500:")
                val denominacion = readLine()?.toIntOrNull() ?: 0
                alcancia.agregarMoneda(denominacion)
                println("La moneda ha sido agregada exitosamente.")
            }
            2 -> alcancia.mostrarCantidad()
            3 -> alcancia.mostrarTotal()
            4 -> {
                alcancia.vaciarAlcancia()
                println("Alacancia nueva.")
            }
            5 -> println("Saliendo del programa...")
            else -> println("Opción no válida.")
        }
        println()
    } while (opcion != 5)
}
