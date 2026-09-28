fun main() {

    val tarefas = listOf(
        "Estudar Kotlin",
        "Fazer exercícios",
        "Ler um livro",
        "Organizar o material"
    )

    for (i in tarefas.indices) {
        println("${i + 1} - ${tarefas[i]}")
    }
}
