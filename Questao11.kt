fun main() {

    for (linha in 0 until 5) {
        for (coluna in 0 until 5) {

            if (linha == coluna) {
                print("X ")
            } else {
                print("* ")
            }
        }

        println()
    }
}
