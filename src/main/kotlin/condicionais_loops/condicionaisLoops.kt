package condicionais_loops

fun main() {

    val a: String = "SUBNUTRICAO"
    temPrefixo(a).let (:: println)

    val b : String = "DESNUTRICAO"
    temPrefixo(b).let(:: println)

}

fun temPrefixo(x: Any) = when(x){
    is String -> x.startsWith("SUB")
    else -> false
}