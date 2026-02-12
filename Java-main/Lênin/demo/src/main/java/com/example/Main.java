package com.example;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.Marca = "Fiat";
        meuCarro.Modelo = "Pulse";
        meuCarro.Ano = 2025;

        meuCarro.exibirDetalhes();
    }
}