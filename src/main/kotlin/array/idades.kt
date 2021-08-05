fun main(){
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("Media entre as idades: ${media}")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores? ${todosMaiores}")

    val existeMaior = idades.any {it >= 18}
    println("Algum aluno é maior de idade? $existeMaior");

    val maiores = idades.filter{ it >= 18 }
    println("Maiores: $maiores")

    val procura = idades.find { it > 18}
    println("Procura: $procura")
}