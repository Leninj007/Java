package com.poo;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(String tipoGeometrico, double raio){
        super(tipoGeometrico);
        this.raio = raio;
    }

    public double getRaio() { return raio; }
    public void setRaio(double raio) { this.raio = raio; }

    @Override
    public void calcularForma(){
        double area = Math.PI * (raio * raio);
        double perimetro = 2 * Math.PI * raio;

        System.out.println("A área do círculo é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);
    }
}
