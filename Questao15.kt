fun main() {

    val lotes = listOf(
        listOf(100, 200, 150),
        listOf(50, 300, -10),
        listOf(100, 200, 100)
    )

    loopLotes@ for (lote in lotes) {

        for (valor in lote) {

            if (valor < 0) {
                println("Valor negativo encontrado. Processamento interrompido.")
                break@loopLotes
            }

            println("Valor processado: $valor")
        }
    }
}
