package list

fun main() {
    listaDeLivrosExterno
        .groupBy{it.editora ?: "Editora desconhecida"}
        .forEach{ (editora, livros)->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}