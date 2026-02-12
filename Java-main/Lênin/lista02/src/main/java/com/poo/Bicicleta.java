package com.poo;

public class Bicicleta extends Veiculo{
    public Bicicleta(String nome){
        super(nome);
    }

    @Override
    public void mover(){
        System.out.println(getNome() + " Está andando sobre 2 rodas e pedalando.");
    }
}
