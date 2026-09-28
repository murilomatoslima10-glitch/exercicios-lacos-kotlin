fun main() {

    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana")
    val idades = listOf(17, 21, 15, 30)

    for (i in nomes.indices) {

        if (idades[i] < 18) {
            println("${nomes[i]} é menor de idade.")
        } else if (idades[i] <= 25) {
            println("${nomes[i]} tem entre 18 e 25 anos.")
        } else {
            println("${nomes[i]} tem mais de 25 anos.")
        }
    }
}
