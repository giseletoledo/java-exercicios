package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int  num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        int  num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        int resultado = 0;

        if(num1 > num2) {
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null, "O resultado é:" + resultado);
        }else {
            resultado = num2 - num1;

        JOptionPane.showMessageDialog(null, "O resultado é:" + resultado);
         }
    }
}
