package stream


fun main() {
    val result = listOf(1, 2, 3, 4, 5)
        .map { n -> n * n }
        .filter { n -> n < 10 }
        .let(::println)

    val result2 = listOf(20, 30, 50, 70, 90)
        .map { n -> n * n }
        .filter { n -> n < 1000 }
        .let(::println)
}