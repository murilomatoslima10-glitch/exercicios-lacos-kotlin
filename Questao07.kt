fun main() {

    for (progresso in 0..100 step 10) {

        println("Download: $progresso%")

        if (progresso == 50) {
            println("Erro no download!")
            break
        }
    }
}
