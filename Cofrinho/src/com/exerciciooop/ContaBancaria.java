package com.exerciciooop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    Date dataAbertura;
    boolean bloqueado;
    
    public int getNumero() {
        return numeroConta;
    }

    public void setNumero(int numero) {
        this.numeroConta = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        return dtf.format(now);
    }

    public void setDataAbertura(Date dataAbertura) {
       this.dataAbertura = dataAbertura;
    }

    public void criar() {
        System.out.println("Conta: " + numeroConta + " criada");
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public void debitar(double valor) {
        if ((this.saldo < 0 || valor > this.saldo)){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo = this.saldo - valor;
        }
    }

    public void bloquear() {
        System.out.println("Conta bloqueada");
        bloqueado = true;
    }

    public void desbloquear() {
        if(bloqueado){
           bloqueado = false;
           System.out.println("Conta desbloqueada");
        }
    }
}
