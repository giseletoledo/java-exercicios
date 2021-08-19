package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        float nota = scan.nextFloat();

        System.out.println("Digite o número de faltas: ");
        int falta = scan.nextInt();

        if((nota >= 0 && nota <= 5) || (falta > 9)) {
            System.out.println("Reprovado");
        } else if((nota > 5 && nota < 8) && falta < 10){
            System.out.println("Aprovado com restrição");
        } else if(nota == 10){
            System.out.println("Aprovado com mérito");
        }
    }
}
