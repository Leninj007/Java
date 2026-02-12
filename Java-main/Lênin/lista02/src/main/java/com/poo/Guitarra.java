package com.poo;

public class Guitarra extends InstrumentoMusical{
    public Guitarra(String tipo){
        super(tipo);
    }

    @Override
    public void tocar(){
        System.out.println(getTipo() + " Está tocando We Will Rock You...");
    }
}
