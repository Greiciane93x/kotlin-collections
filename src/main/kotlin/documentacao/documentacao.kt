package documentacao

import java.util.*

fun main() {
    val numeroSet = setOf("primeiro", "segundo", "terceiro")
    val emptySet = mutableSetOf<String>()

    println(numeroSet)
    println(emptySet)

    val numeroMap = mapOf("chave 1" to 1, "chave 2" to 2, "chave 3" to 3)
    println(numeroMap)

    val empty = emptyList<String>()
    println(empty)

    val doubled = List(10, { it * 2 })
    println(doubled)

    val linkedList = LinkedList<String>(listOf("um", "dois", "tres"))
    println(linkedList)

    val sourceList = mutableListOf(1, 2, 3)
    val copyList = sourceList.toMutableList()
    val readOnlyCopyList = sourceList.toList()

    sourceList.add(4)
    println("${copyList.size}")

    println("[READ-ONLY] - ${readOnlyCopyList.size}")

    val sourceList2 = mutableListOf(1,2,3)
    val referenciaList: List<Int> = sourceList2
    sourceList2.add(4)
    println(referenciaList)

    val numeros2 = listOf("one", "two", "three", "four")
    val maiorQue3 = numeros2.filter{ it.length > 3}
    println(maiorQue3)

    val numeros3 = setOf(1,2,3)
    println(numeros3.map{ it * 3})
    println(numeros3.mapIndexed { index, valor -> valor * index} + "MAP INDEXED")


    // intervalo de valores - é complementado por funções in ou !in
    for(i in 1..4) print("$i " )
    // aqui invertemos a ordem
    for(i in 4 downTo 1) print("$i ")

    println()
    for(i in 20 downTo 4 step 2) print("$i ")
    println()
    for(i in 1 until 10) print("$i ")

    println()
    // são geralmente usados por iterações em for loops
    for(i in 1..4) print("$i")


    // utilizando until não inclui o ultimo elemento
    // podemos ver isso na iteracao abaixo
    for(i in 1 until 10){
        print("$i ")
    }


//    Progressão

    for( i in 0..100 step 1) print("$i ")
    println()
    for( i in 0..100 step 2) print("$i ")
    println()
    for( i in 0..100 step 3) print("$i ")
    println()
    for( i in 0..100 step 4) print("$i ")
    println()
    for( i in 0..100 step 5) print("$i ")
    println()
    for( i in 0..100 step 6) print("$i ")
    println()
    for( i in 0..100 step 7) print("$i ")
    println()
    for( i in 0..100 step 8) print("$i ")
    println()
    for( i in 0..100 step 9) print("$i ")
    println()
    for( i in 0..100 step 10) print("$i ")

    // para passos positivos
}
