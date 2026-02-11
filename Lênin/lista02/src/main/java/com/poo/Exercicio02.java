package com.poo;

public class Exercicio02 {
    public static void main(String[] args){
        InstrumentoMusical minhaGuitarra = new Guitarra("Guitarra");
        InstrumentoMusical meuPiano = new Piano("Piano");

        minhaGuitarra.exibirTipo();
        minhaGuitarra.tocar();

        System.out.println("---");

        meuPiano.exibirTipo();
        meuPiano.tocar();
    }
}
