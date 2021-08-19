import java.util.Scanner;

public class Funcoes {

    public static void calcularTrianguloEquilatero(Scanner scan, double num1, double num2, double num3) {
        if(num1 <= 0 || num2 <= 0 || num3 <= 0){
            System.out.println("Não é um triângulo");
            return;
        } else {
            if(num1 == num2 && num1 == num3){
                System.out.println("É um triângulo equilátero");
            }
        }
    }

    public static void calcularTrianguloEscaleno(Scanner scan, double num1, double num2, double num3) {
        if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
            System.out.println("Não é um triângulo");
            return;
        } else {
            if (num1 == num2 || num1 == num3) {
                System.out.println("É um triângulo isósceles");
            }
        }
    }

    public static void calcularTrianguloIsoceles(Scanner scan, double num1, double num2, double num3) {
        if(num1 <= 0 || num2 <= 0 || num3 <= 0){
            System.out.println("Não é um triângulo");
            return;
        } else {
            if(num1 != num2 && num1 != num3){
                System.out.println("É um triângulo escaleno");
            }
        }
    }

    public static void calcularPositivoNegativo(Scanner scan, double num1, double num2, double num3) {
        if(num1 < 0){
            System.out.println("Número negativo");
        } else if(num1 > 0){
            System.out.println("Número positivo");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        double num1 = scan.nextDouble();
        System.out.println("Digite um número:");
        double num2 = scan.nextDouble();
        System.out.println("Digite um número:");
        double num3 = scan.nextDouble();

        calcularPositivoNegativo(scan, num1, num2, num3);
        calcularTrianguloEquilatero(scan, num1, num2, num3);
        calcularTrianguloIsoceles(scan, num1, num2, num3);
        calcularTrianguloEscaleno(scan, num1, num2, num3);

    }

}
