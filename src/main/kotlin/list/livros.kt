package list

val listaDeLivrosExterno: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacacao = 1956
    ) ,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacacao = 1865,
        editora = "editora B"
    ) ,
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacacao = 1881

    ),
    Livro (
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicacacao = 1938,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicacacao = 1979,
        editora = "Editora B"
    )
)
val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacacao = 1956
    ) ,
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacacao = 1942,
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacacao = 1865,
        editora = "editora B"
    ) ,
    null,
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacacao = 1881

    ),
    null,
    Livro (
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicacacao = 1938,
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicacacao = 1979,
        editora = "Editora B"
    )
)