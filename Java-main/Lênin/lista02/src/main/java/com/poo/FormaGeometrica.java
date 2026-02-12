package com.poo;

public abstract class FormaGeometrica {
    private String tipoGeometrico;

    public FormaGeometrica(String tipoGeometrico){
        this.tipoGeometrico = tipoGeometrico;
    }

    public abstract void calcularForma();

    public String getTipoGeometrico() { return tipoGeometrico; }
    public void setTipoGeometrico(String tipoGeometrico) { this.tipoGeometrico = tipoGeometrico; }
}
