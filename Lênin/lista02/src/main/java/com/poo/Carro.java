package com.poo;

public class Carro extends Veiculo{
    public Carro(String nome){
        super(nome);
    }

    @Override
    public void mover(){
        System.out.println(getNome() + " Está se movendo com 4 rodas e um motor.");
    }
}
