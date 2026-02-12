package com.poo;

public class Exercicio03 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("Círculo", 5.0);
        System.out.println("--- Dados do Círculo ---");
        c1.calcularForma();

        System.out.println();
        
        Retangulo r1 = new Retangulo("Retângulo", 10, 5);
        System.out.println("--- Dados do Retângulo ---");
        r1.calcularForma();
    }
}
