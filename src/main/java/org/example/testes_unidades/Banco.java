/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.testes_unidades;

import java.util.ArrayList;
import java.util.List;


public class Banco {
    private String nome;
    private int codigo;

    private static int geradorCodigoBanco = 0;
    private int geradorCodigoConta;
    List<Conta> contas;
    
    public Banco(String nome){
        this.nome = nome;
        this.codigo = ++geradorCodigoBanco;
        this.geradorCodigoConta = 0;
        contas = new ArrayList<>();

    }
    
    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public Conta criarContaCorrente(String nomeCorrentista){
        Conta contaCorrente = new Conta(++geradorCodigoConta, this, nomeCorrentista);
        contas.add(contaCorrente);
        return contaCorrente;
    }

    public ContaPoupanca criarContaPoupanca(String nomeCorrentista){
        ContaPoupanca contaPoupanca = new ContaPoupanca(++geradorCodigoConta, this, nomeCorrentista);
        contas.add(contaPoupanca);
        return contaPoupanca;
    }
    
    
    public Conta getConta(int codigo){
        for(Conta c: contas){
            if(c.getCodigo() == codigo){
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Banco{" + "nome=" + nome + ", codigo=" + codigo + ", geradorCodigoConta=" + geradorCodigoConta + ", contas=" + contas + '}';
    }


    
    
}
