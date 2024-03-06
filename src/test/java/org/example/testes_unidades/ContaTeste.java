package org.example.testes_unidades;

import org.junit.Assert;
import org.junit.Test;

public class ContaTeste {

    @Test
    public void deveCriarConta(){
        //Arrange
        String nomeBanco = "Banco Itau";
        String nomeCorrentista = "";
        int codigoConta = 1;

        //Act
        Banco ban = new Banco(nomeBanco);
        Conta con = new Conta(codigoConta, ban, nomeCorrentista);

        //Assert
        Assert.assertEquals(con.getCodigo(), codigoConta);
        Assert.assertEquals(con.getBanco(), ban);
    }
}
