fun main() {

    val pratos = listOf("Arroz", "Feijão", "Pizza", "Macarrão")
    val itemEsgotado = "Pizza"

    for (prato in pratos) {

        if (prato == itemEsgotado) {
            continue
        }

        println("Prato disponível: $prato")
    }
}
