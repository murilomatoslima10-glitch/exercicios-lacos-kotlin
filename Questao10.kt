fun main() {

    val depositos = listOf(100, 150, 200, 100, 50)
    var saldo = 0

    for (deposito in depositos) {
        saldo += deposito

        println("Depósito: R$ $deposito")
        println("Saldo: R$ $saldo")

        if (saldo >= 500) {
            println("Meta atingida!")
            break
        }
    }
}
