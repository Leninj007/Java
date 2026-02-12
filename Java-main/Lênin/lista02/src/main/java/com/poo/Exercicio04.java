package com.poo;

public class Exercicio04 {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Márcio", 2500.00);
        System.out.println("--- Dados do Gerente ---");
        g1.exibirDados();

        System.out.println();

        Estagiario e1 = new Estagiario("Carlos", 550.00);
        System.out.println("--- Dados do Estagiário ---");
        e1.exibirDados();
    }
}
