/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.exemplos_prontos;

/**
 *
 * @author mattheus
 */
public class ContaCorrente {

    private int codigo;
    private String nome;
    private Banco banco;
    private float saldo;
    
    public ContaCorrente(int codigo, Banco banco, String nomeCorrentista) {
        this.codigo = codigo;
        this.banco = banco;
        nome = nomeCorrentista;
        saldo = 0.0f;
    }

    public String getNome() {
        return nome;
    }

    public Banco getBanco() {
        return banco;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    
    public void fazerAplicacao(float  valorAplicacao) {
        saldo += valorAplicacao;
    }

    public void efetuarDebito(float valorDebito) {
        saldo -= valorDebito;
    }

}
