package teste

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima: (a: Int, b: Int) -> Int = fun(a, b): Int {
        return a + b
    }
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1000.0))
    println(minhaFuncaoAnonima(100, 100))
}
val minhaFuncaoLambda: (Int, Int) -> Int = { a,b -> 3 * b }

val calculaBonificacao: (salario: Double) -> Double =  lambda@{ salario ->
    if(salario > 1000.0){
        return@lambda salario+ 50.0
    }

    return@lambda salario + 100.0
}


fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasses(10,10))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(10 , 20))
}

fun soma(a: Int, b:Int) : Int{
    return a + b
}
class Soma : (Int, Int) -> Int{
    override fun invoke(a: Int, b: Int):  Int = a + b

}