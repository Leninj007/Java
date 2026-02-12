package com.poo;

public class Retangulo extends FormaGeometrica{
    private double base;
    private double altura;

    public Retangulo(String tipoGeometrico, double base, double altura){
        super(tipoGeometrico);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    @Override
    public void calcularForma(){
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }
}
