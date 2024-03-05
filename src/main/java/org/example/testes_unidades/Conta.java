package org.example.testes_unidades;


public class Conta {
    
    private int codigo;
    private Banco banco;
    private String nomeCorrentista;
    protected float saldo;

    public Conta(int codigo, Banco banco, String nomeCorrentista) {
        this.banco = banco;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0f;
        this.codigo = codigo;
    }
    
    public void deposita(float valor){
        this.saldo += valor;
    }
    
    public boolean saque(float valor){
        this.saldo -= valor;
        return true;
    }

    public Banco getBanco() {
        return banco;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Conta{" + "codigo=" + codigo + ", nomeCorrentista=" + nomeCorrentista + ", saldo=" + saldo + '}';
    }
    
}
