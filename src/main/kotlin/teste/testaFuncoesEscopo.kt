//package teste
//
//fun testaFuncoesEscopo() {
//    Endereco(logradouro = "Rua Helena").let { endereco ->
//        "${endereco.logradouro}".toUpperCase()
//    }.let(::println)
//
//    Endereco(logradouro = "Rua Açú").run {
//        "${logradouro}".toUpperCase()
//    }.let(::println)
//
//    val endereco2 = Endereco(logradouro = "Rua Tamandaré")
//        .also { println("Novo Logradouro: ") }
//        .apply {
//            println(logradouro)
//        }
//
//    val endereco1 = Endereco(logradouro = "Rua três")
//    with(endereco1) {
//        logradouro.toUpperCase()
//    }.let { enderecoEmMaiusculo: String ->
//        println(enderecoEmMaiusculo)
//    }
//
//    Pessoa(nome = "Ane", idade = 28).let(::println)
//    Pessoa(nome = "Alice", idade = 3).let { pessoa ->
//        "${pessoa.nome} " + pessoa.idade * 2
//    }.let(::println)
//
//    listOf(
//        Endereco(logradouro = "Rua 1"),
//        Endereco(logradouro = "Rua 2"),
//        Endereco(logradouro = "Rua 3")
//    )
//        .filter { endereco -> endereco.logradouro.isNotEmpty() }
//        .let(::println)
//
//    soma(1, 5, resultado = (::println))
//}
//
