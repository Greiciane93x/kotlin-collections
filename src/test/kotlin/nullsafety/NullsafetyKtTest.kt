package nullsafety

import org.junit.Assert
import org.junit.Test

internal class NullsafetyKtTest{

    @Test
    fun `nao deve ter valores nulos`(){
        val lista : List<String?> = listOf(
            "Testando", null, "Itens", null,null
        )
        var listaNull : MutableList<String?> = mutableListOf()

        for(item in lista){
            if(item.equals(null)){
               listaNull.add(item)
            }
        }

        Assert.assertTrue(listaNull.contains(null))
//        Assert.assertEquals(null,  null) - ops!!
    }

    @Test
    fun `nao deve ter valores nulos2`(){
        var lista : List<String?> = listOf("Test2", null, null, null)
        Assert.assertTrue(lista.contains(null))
    }


    @Test
    fun `deve ter apenas valores nao nulos`(){
        var lista : List<String?> = listOf("Test2", "Testand", "Ane", "Aprendendo tests")
        Assert.assertTrue(!lista.contains(null))
    }

    @Test
    fun `deve filtrar somente nomes com ane`(){
        var lista : List<String?> = listOf(
            "Ane Assis",
            "Ane Araujo",
            "Ane Rocha",
            "Alice Rocha",
            "Alice",
            "Bruno Rocha",
            "Bruno"
        )

       Assert.assertTrue("Ane Assis", lista.contains("Ane Assis"))
    }

    @Test
    fun `soma deve ser maior que 100`(){
        var num1 : Int = 100
        var num2 : Int = 900

        Assert.assertEquals(1000, num1+num2)
    }


}


