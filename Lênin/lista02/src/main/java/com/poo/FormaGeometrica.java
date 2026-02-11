package com.poo;

public abstract class FormaGeometrica {
    private String tipoGeometrico;

    public FormaGeometrica(String tipoGeometrico){
        this.tipoGeometrico = tipoGeometrico;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public String getTipoGeometrico() { return tipoGeometrico; }
    public void setTipoGeometrico(String tipoGeometrico) { this.tipoGeometrico = tipoGeometrico; }

    public void exibirArea(){
        System.out.println(tipoGeometrico + " Tem uma área de: ");
    }

    public void exibirPerimetro(){
        System.out.println(tipoGeometrico + " Tem um perímetro de: ");
    }
}
