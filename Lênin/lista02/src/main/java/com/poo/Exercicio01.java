package com.poo;

public class Exercicio01 {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro("Fusca");
        Veiculo minhaBike = new Bicicleta("Mountain Bike");

        meuCarro.exibirNome();
        meuCarro.mover();

        System.out.println("---");

        minhaBike.exibirNome();
        minhaBike.mover();
    }
}