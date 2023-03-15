class Alcancia {
    private var cantidad20: Int = 0
    private var cantidad50: Int = 0
    private var cantidad100: Int = 0
    private var cantidad200: Int = 0
    private var cantidad500: Int = 0
    private var total: Int = 0

    fun agregarMoneda(valor: Int) {
        when (valor) {
            20 -> {
                cantidad20++
                total += 20
            }
            50 -> {
                cantidad50++
                total += 50
            }
            100 -> {
                cantidad100++
                total += 100
            }
            200 -> {
                cantidad200++
                total += 200
            }
            500 -> {
                cantidad500++
                total += 500
            }
            else -> println("Valor no válida.")
        }
    }

    fun mostrarCantidad() {
        println("Cantidad de monedas de cada una:")
        println("20: $cantidad20")
        println("50: $cantidad50")
        println("100: $cantidad100")
        println("200: $cantidad200")
        println("500: $cantidad500")
    }

    fun mostrarTotal() {
        println("Total guardado en la alcancía: $total")
    }

    fun vaciarAlcancia() {
        cantidad20 = 0
        cantidad50 = 0
        cantidad100 = 0
        cantidad200 = 0
        cantidad500 = 0
        total = 0
        println("La alcancía ha sido vaciada.")
    }

}