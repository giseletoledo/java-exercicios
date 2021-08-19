package com.exerciciooop;

public class Cofrinho {
    private double saldo;
    public double deposita(double valor){
        return saldo += valor;
    }
    public double retira(double valor){
        if((this.saldo < 0) || (this.saldo < valor)) {
          System.out.println("Saldo insuficiente");
        } else {
           saldo = saldo - valor;
        }
        return saldo;
    }

    public double mostraSaldo(){
        return this.saldo;
    }


}
