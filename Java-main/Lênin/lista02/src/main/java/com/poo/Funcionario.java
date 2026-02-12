package com.poo;

public abstract class Funcionario {
    private String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public void exibirDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Salário Calculado: R$ " + calcularSalario());
    }
}
