/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.exemplos_prontos;

/**
 *
 * @author mattheus
 */
public class ContaPoupanca extends ContaCorrente {

    public ContaPoupanca(int codigo, Banco banco, String nomeCorrentista) {
        super(codigo, banco, nomeCorrentista);
    }
    
    @Override
    public void efetuarDebito(float valorDebito) {
        if(getSaldo() >= valorDebito)
            super.efetuarDebito(valorDebito);
        else
            System.out.println("saldo insuficiente");
    }
    
    
}
