package com.poo;

public abstract class InstrumentoMusical {
    private String tipo;

    public InstrumentoMusical(String tipo){
        this.tipo = tipo;
    }

    public abstract void tocar();

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public void exibirTipo(){
        System.out.println("Instrumento: " + tipo);
    }
}
