package org.example.testes_unidades;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

public class BancoTeste {

    @Test
    public void deveCriarNovoBanco(){
        //Arrange
        String nome = "Banco Itau";

        //Act
        Banco ban = new Banco(nome);

        //Assert
        Assert.assertEquals(ban.getNome(), nome);
        Assert.assertEquals(ban.getCodigo(), 2);
    }

    @Test
    public void deveGerarCodigoSequencial(){
        //Arrange
        String nome = "Banco Itau";

        //Act
        Banco ban1 = new Banco(nome);
        Banco ban2 = new Banco(nome);
        Banco ban3 = new Banco(nome);

        //Assert
        Assert.assertEquals(ban1.getCodigo(), 3);
        Assert.assertEquals(ban2.getCodigo(), ban1.getCodigo() + 1);
        Assert.assertEquals(ban3.getCodigo(), ban2.getCodigo() + 1);
    }

    @Test
    public void deveFalharAoCriarBancoComNomeVazio() {
        //Arrange
        String nome = "XX";

        //Act
        Banco ban4 = new Banco(nome);

        //Assert
        Assert.assertNotEquals(ban4.getNome(), "");
    }
}
