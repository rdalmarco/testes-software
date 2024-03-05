/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.testes_unidades;

/**
 *
 * @author mattheus
 */
public class App {
    public static void main(String[] args) {
        Banco bb = new Banco("BB");
        Banco bancointer = new Banco("Banco Inter");
        
        bb.criarContaCorrente("correntista");
        
        bb.criarContaCorrente("correntista2");
       
        bb.criarContaPoupanca("correntista3");
        
        System.out.println(bb);
        System.out.println(bancointer);
        
        Conta conta = bb.getConta(2);
        
        if(conta != null)
            System.out.println(conta);
        else
            System.out.println("Conta não encontrada");
    }
}
