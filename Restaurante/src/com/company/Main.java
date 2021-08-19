package com.company;

public class Main {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        String nomeRestaurante = restaurante.getNome("Tempero Caseiro");
        String localizacao = restaurante.localizacao;
        String cliente = restaurante.cliente;
        double conta = restaurante.conta;
        localizacao = "Rua Javadoc";
        cliente = "Jose";
        conta = 25.6;
        System.out.println("Restaurante " + nomeRestaurante + " no endereço " +localizacao+ " cliente " + cliente + " gastou " + conta);

    }
}
