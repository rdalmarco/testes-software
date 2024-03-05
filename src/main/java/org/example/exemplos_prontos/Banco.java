/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.exemplos_prontos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mattheus
 */
public class Banco {
    
    private String nome;
    private int codigo;
    List<ContaCorrente> contas;
    private int geradorCodigoConta;
    
    public Banco(int codigoBanco, String nomeBanco) {
        nome = nomeBanco;
        codigo = codigoBanco;
        contas = new ArrayList();
        geradorCodigoConta = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public ContaCorrente criarNovaContaCorrente(String nomeCorrentista) {
        ContaCorrente contaCorrente = new ContaCorrente(++geradorCodigoConta, this, nomeCorrentista);
        contas.add(contaCorrente);
        return contaCorrente;
    }

    public ContaPoupanca criarNovaContaPoupanca(String nomeCorrentista) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(++geradorCodigoConta, this, nomeCorrentista);
        contas.add(contaPoupanca);
        return contaPoupanca;
    }

    public ContaCorrente getContaPeloCodigo(int codigo) {
        for(ContaCorrente conta: contas){
            if(conta.getCodigo() == codigo)
                return conta;
        }
        return null;
    }

    
    
    
    
}
