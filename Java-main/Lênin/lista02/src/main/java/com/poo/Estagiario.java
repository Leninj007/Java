package com.poo;

public class Estagiario extends Funcionario{
    private double auxilioTransporte = 200.00;

    public Estagiario(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    public double getAuxilioTransporte() { return auxilioTransporte; }
    public void setAuxilioTransporte(double auxilioTransporte) { this.auxilioTransporte = auxilioTransporte; }

    @Override
    public double calcularSalario(){
        return salarioBase + auxilioTransporte;
    }
}
