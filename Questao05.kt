fun main() {

    val senhaCorreta = "1234"
    var tentativas = 0
    var senha = ""

    do {
        tentativas++

        senha = if (tentativas == 1) {
            "1111"
        } else if (tentativas == 2) {
            "2222"
        } else {
            "1234"
        }

        println("Tentativa $tentativas: $senha")

    } while (senha != senhaCorreta && tentativas < 3)

    if (senha == senhaCorreta) {
        println("Senha correta!")
    } else {
        println("Acesso bloqueado!")
    }
}
