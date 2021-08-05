package list

data class Prateleira (
    val genero: String,
    val livros: List<Livro>
){
    fun organizaPorAutor(): List<Livro>{
        return livros.sortedBy{it.autor}
    }
    fun organizarPorAnoPublicacao(): List<Livro>{
        return livros.sortedBy { it.anoPublicacacao }
    }
}