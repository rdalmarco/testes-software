/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.testes_unidades;


public class ContaPoupanca extends Conta {

    public ContaPoupanca(int codigo, Banco banco, String nomeCorrentista) {
        super(codigo, banco, nomeCorrentista);
    }

 
    @Override
    public boolean saque(float valor){
        if(saldo - valor < 0.0){
            System.out.println("Não foi possível realizar o saque");
            return false;
        }
        else {
           return super.saque(valor);
        }
        
    }
    
        @Override
    public String toString() {
        return "Conta{" + "codigo=" + getCodigo() + ", nomeCorrentista=" + getNomeCorrentista() + ", saldo=" + getSaldo() + ", Tipo=Poupança" + '}';
    }

}
