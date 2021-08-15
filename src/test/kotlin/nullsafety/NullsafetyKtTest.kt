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
}