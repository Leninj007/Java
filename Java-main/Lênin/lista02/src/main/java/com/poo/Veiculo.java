package com.poo;

public abstract class Veiculo {
    private String nome;

    public Veiculo (String nome){
        this.nome = nome;
    }

    public abstract void mover();

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public void exibirNome(){
        System.out.println("Veiculo: " + nome);
    }
}
