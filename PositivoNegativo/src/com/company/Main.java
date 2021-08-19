package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	int num1;
	num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
	if(num1 < 0){
	    JOptionPane.showMessageDialog(null,"Número negativo");
    } else if(num1 > 0){
	    JOptionPane.showMessageDialog(null, "Número positivo");
    }
    }
}
