fun main() {

   val salarios: DoubleArray =  doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)

//    var i = 0
//    for(salario in salarios){
//        salarios[i] = salario * aumento
//        i++
//    }

    val aumento = 1.1
    for(i in salarios.indices ){
        salarios[i] = salarios[i] * aumento
     }

    println(salarios.contentToString())
    
    salarios.forEachIndexed{i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}