package nullsafety

fun main() {
    val listaComNulos : List<String?> = listOf(
        "Estudando Kotlin",
        null,
        "Estudando Kotlin2",
        null,
        "Estudando Kotlin3",
        null
    )
    for(item in listaComNulos){
        if(item == null){
            println("Essa lista tem valores nulos")
        }
    }

}