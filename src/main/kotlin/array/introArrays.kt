fun main(){
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade3 && idade2 > idade4)  {
        idade2
    } else if(idade3 > idade4){
        idade3
    }else {
        idade4
    }
    println(maiorIdade)

    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55,101, 800, 1001)
//        idades[0] = 25
//        idades[1] = 19
//        idades[2] = 33
//        idades[3] = 20
//        idades[4] = 55

    var maiorIdade2 = 0
    for(idade in idades){
        if(idade > maiorIdade2){
            maiorIdade2 = idade
        }
    }

    println("$maiorIdade2 [maior idade - iterando]")
    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade  ->
        if(idade < menorIdade ){
            menorIdade = idade
        }
    }
    println("$menorIdade [menor idade - foreach]")
}
