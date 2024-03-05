/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.example.exemplos_prontos;

import org.example.exemplos_prontos.Banco;
import org.example.exemplos_prontos.ContaCorrente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mattheus
 */
public class ContaCorrenteTest {

    Banco banco;
    ContaCorrente contaCorrente;

    @Before
    public void setUp() {
        banco = new Banco(1, "Banco 1");
        String nomeCorrentista1 = "Mattheus da Hora";
        contaCorrente = banco.criarNovaContaCorrente(nomeCorrentista1);
    }

    @Test
    public void deveFazerUmaAplicacaoNaContaCorrente() {
        //Arrange
        float valorAplicacao = 1000.50f;
        
        //Act
        contaCorrente.fazerAplicacao(valorAplicacao);
        
        //Assert
        Assert.assertEquals(valorAplicacao, contaCorrente.getSaldo(), 0);
    }
    
    @Test
    public void deveFazerDuasAplicacoesNaContaCorrente() {
        //Arrange
        float valorAplicacao1 = 1000.50f;
        float valorAplicacao2 = 200;
        
        
        //Act
        contaCorrente.fazerAplicacao(valorAplicacao1);
        contaCorrente.fazerAplicacao(valorAplicacao2);
        
        //Assert
        float valorEsperado = valorAplicacao1+valorAplicacao2;
        Assert.assertEquals(valorEsperado, contaCorrente.getSaldo(), 0);
    }

    @Test
    public void deveEfetuarUmDebitoNaContaCorrente() {
        //Arrange
        float valorDebito = 100;
        
        //Act
        contaCorrente.efetuarDebito(valorDebito);
        
        //Assert
        Assert.assertEquals(-100, contaCorrente.getSaldo(), 0);

    }

}
