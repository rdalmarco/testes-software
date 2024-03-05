/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.exemplos_prontos;

import org.example.exemplos_prontos.Banco;
import org.example.exemplos_prontos.ContaCorrente;
import org.example.exemplos_prontos.ContaPoupanca;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mattheus
 */
public class BancoTest {
    
    Banco banco;
    
    @Before
    public void setUp(){
            banco = new Banco(1, "Banco 1");
    }

    @Test
    public void deveCriarNovoBanco(){
        //Arrange
        String nomeBanco = "Banco 1";
        int codigoBanco = 1;
        
        
        //Act
        Banco novoBanco = new Banco(codigoBanco, nomeBanco);
        
        //Assert
        Assert.assertEquals(codigoBanco, novoBanco.getCodigo());
        Assert.assertEquals("Nome do Banco deve ser Banco 1", nomeBanco, novoBanco.getNome());
        
    }
    
    @Test
    public void deveCriarNovaContaCorrente(){
        //Arrange
        String nomeCorrentista = "Mattheus da Hora";
        
       
        //Act
        ContaCorrente novaContaCorrente = banco.criarNovaContaCorrente(nomeCorrentista);
        
        //Assert
        Assert.assertTrue("Nova conta não pode ser nula", novaContaCorrente != null);
        Assert.assertEquals(nomeCorrentista, novaContaCorrente.getNome());
        Assert.assertEquals(banco, novaContaCorrente.getBanco());
    }
    
    @Test
    public void deveCriarContaPoupanca(){
        //Arrange
        String nomeCorrentista = "Mattheus da Hora";
        
       
        //Act
        ContaPoupanca novaContaPoupanca = banco.criarNovaContaPoupanca(nomeCorrentista);
        
        //Assert
        Assert.assertTrue("Nova conta não pode ser nula", novaContaPoupanca != null);
        Assert.assertEquals(nomeCorrentista, novaContaPoupanca.getNome());
        Assert.assertEquals(banco, novaContaPoupanca.getBanco());
    }
    
    @Test
    public void deveObterContaPeloCodigo(){
        //Arrange
        String nomeCorrentista1 = "Mattheus da Hora";
        String nomeCorrentista2 = "Marília Guterres";
        
        ContaCorrente contaCorrente = banco.criarNovaContaCorrente(nomeCorrentista1);
        ContaPoupanca contaPoupanca = banco.criarNovaContaPoupanca(nomeCorrentista2);
        
        int codigoCorrentista1 = contaCorrente.getCodigo();
        int codigoCorrentista2 = contaPoupanca.getCodigo();
        
        //Act
        ContaCorrente contaCorrenteRecuperada = banco.getContaPeloCodigo(codigoCorrentista1);
        ContaPoupanca contaPoupancaRecuperada = (ContaPoupanca) banco.getContaPeloCodigo(codigoCorrentista2);   
        
        //Assert
        Assert.assertEquals(contaCorrente, contaCorrenteRecuperada);
        Assert.assertEquals(contaPoupanca, contaPoupancaRecuperada);
    }
    
   @Test
   public void naoDeveEncontrarContaAoBuscarPorCodigoInexistente(){
       int codigo = 1;
       
       //Act
       ContaCorrente contaCorrenteRecuperada = banco.getContaPeloCodigo(codigo);
        
        //Assert
        Assert.assertEquals(null, contaCorrenteRecuperada);
        
       
   }
    
}
