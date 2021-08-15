package nullsafety

import org.junit.Assert
import org.junit.Test

internal class NullsafetyKtTest{

    @Test
    fun `nao deve ter valores nulos`(){
        val lista : List<String?> = listOf(
            "Testando", null, "Itens", null,null
        )
        var listaNull : List<String?> = listOf()
        for(item in lista){
            if(item == null){
               listaNull.toMutableList().add(item)
            }
        }
        Assert.assertEquals(null,  null)
    }
}