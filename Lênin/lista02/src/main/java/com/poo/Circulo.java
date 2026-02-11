package com.poo;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(String tipoGeometrico){
        super(tipoGeometrico);
        this.raio = raio;
    }

    public double getRaio() { return raio; }
    public void setRaio(double raio) { this.raio = raio; }

    @Override
    public void calcularArea(){
        double area = Math.PI * (raio * raio);

        System.out.println("A área do círculo é: " + area);
    }
}
