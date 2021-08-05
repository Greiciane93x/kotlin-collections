package list

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivrosExterno)
    val organizaPorAutor = prateleira.organizaPorAutor()
    val organizarPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    organizaPorAutor.imprimeComMarcadores()
    organizarPorAnoPublicacao.imprimeComMarcadores()
}
