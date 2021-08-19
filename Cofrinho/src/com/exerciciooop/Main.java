package com.exerciciooop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner s = new Scanner(System.in);

      Cofrinho cofre = new Cofrinho();

      cofre.deposita(100);
      System.out.println("Saldo do cofre:" + cofre.mostraSaldo());
      cofre.retira(150);
      System.out.println("Saldo do cofre:" + cofre.mostraSaldo());

      //Conta bancária
      ContaBancaria  contaBancaria = new ContaBancaria();

      System.out.println("Ler número da conta do cliente");
      int conta = s.nextInt();
      s.nextLine();
      contaBancaria.setNumero(conta);

      contaBancaria.criar();
      contaBancaria.getDataAbertura();

      System.out.println("Digite o saldo da conta");
      double saldo = s.nextDouble();
      s.nextLine();
      contaBancaria.setSaldo(saldo);

      System.out.println("Digite o crédito");
      double credito = s.nextDouble();
      s.nextLine();
      contaBancaria.creditar(credito);
      System.out.println("Saldo: " + contaBancaria.getSaldo());

      System.out.println("Digite o debito");
      double debito = s.nextDouble();
      s.nextLine();
      contaBancaria.debitar(debito);
      System.out.println("Saldo: " + contaBancaria.getSaldo());

      System.out.println("Deseja bloquear a conta?");// pulando a função se não usar s.nextLine no campo anterior, com tipo diferente
      String opcao = s.nextLine();
      if(opcao.equals("S")){
          contaBancaria.bloquear();
      } else if(opcao.equals("N")){
          contaBancaria.desbloquear();
      }
    }
}
