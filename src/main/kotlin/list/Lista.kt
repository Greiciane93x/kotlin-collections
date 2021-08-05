package list

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacacao = 1956
    )
    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacacao = 1942,
        editora = "Editora A"
    )
    val livro3 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacacao = 1865,
        editora = "editora B"
    )
    val livro4 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacacao = 1881

    )
    val listaDeLivros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)
    listaDeLivros.add(
        Livro(
            titulo = "A arte da Guerra",
            autor = "Sun Tzu",
            anoPublicacacao = 1983,
            editora = "Editora Record"
        )
    )

    listaDeLivros.imprimeComMarcadores()
    val ordenadoPorAnoPublicacao: List<Livro> = listaDeLivros.sorted()
    ordenadoPorAnoPublicacao.imprimeComMarcadores()

    println()

    val ordenadoPorTitulo = listaDeLivros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    println()

    listaDeLivros.sortedBy { it.autor }.imprimeComMarcadores()
    val titulos = listaDeLivrosExterno.filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacacao }
        .map { it.titulo }
    println(titulos)
}
