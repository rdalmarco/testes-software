package org.example.testes_unidades;

import org.junit.Assert;
import org.junit.Test;

public class ContaPoupancaTeste {

    @Test
    public void deveCriarContaPoupanca(){
        //Arrange
        String nome = "Banco Itau";

        //Act
        Banco ban = new Banco(nome);

        //Assert
        Assert.assertEquals(ban.getNome(), nome);
        Assert.assertEquals(ban.getCodigo(), 2);
    }
}
