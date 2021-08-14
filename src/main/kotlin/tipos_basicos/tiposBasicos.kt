package tipos_basicos


fun main() {
    fun printDouble(d : Double){ print(d)}
    val i = 1 // Int
    val d = 1.0 // Double
    val f = 1.0f // Float

    printDouble(d)
//    printDouble(i) - erro de compilacao, pois é do tipo inteiro
//    printDouble(f) - erro de compilacao, pois é do tipo DOuble

    val umMilhao = 1_000_00
    val cartaoDeCredito = 1234_5678_9012_3456L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b110100010_0110100010_01000101001_010101000


}
