/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.example.exemplos_prontos;

import org.example.exemplos_prontos.Banco;
import org.example.exemplos_prontos.ContaPoupanca;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mattheus
 */
public class ContaPoupancaTest {
    
    Banco banco;
    ContaPoupanca contaPoupanca;

    @Before
    public void setUp() {
        banco = new Banco(1, "Banco 1");
        String nomeCorrentista2 = "Marília Guterres";

        contaPoupanca = banco.criarNovaContaPoupanca(nomeCorrentista2);
    }
    
    
    @Test
    public void naoDeveEfetuarDebitoNaContaPoupancaSeSaldoForInsuficiente() {
        //Arrange
        float valorDebito = 100;
        
        //Act
        contaPoupanca.efetuarDebito(valorDebito);
        
        //Assert
        Assert.assertEquals(0, contaPoupanca.getSaldo(), 0);
    }
    
    
    @Test
    public void deveEfetuarDebitoNaContaPoupancaSeSaldoForSuficiente() {
        //Arrange
        float valorAplicacao = 1000;
        float valorDebito = 100;
        
        //Act
        contaPoupanca.fazerAplicacao(valorAplicacao);
        contaPoupanca.efetuarDebito(valorDebito);
        
        //Assert
        float valorEsperado = valorAplicacao - valorDebito;
        Assert.assertEquals(valorEsperado, contaPoupanca.getSaldo(), 0);
    }
    
}
