package com.poo;

public class Piano extends InstrumentoMusical{
    public Piano(String tipo){
        super(tipo);
    }

    @Override
    public void tocar(){
        System.out.println(getTipo() + " Está tocando Dó Ré Mi Fá...");
    }
}
