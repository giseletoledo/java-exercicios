import java.util.Scanner;

public class Calculadora {
     public static int Menu_func(){
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("  Calculadora   ");
        System.out.println("------------------");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("9- SAIR");
        System.out.println("------------------");
        System.out.print("Selecione uma opção: ");
        return scan.nextInt();
    }

    public static void adicao(){
        double num1, num2, resultado;
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("  Adição   ");
        System.out.println("------------------");

        System.out.println("Digite um número:");
        num1 = scan.nextDouble();
        System.out.println("Digite um número:");
        num2 = scan.nextDouble();

        resultado = num1 + num2;

        System.out.println("Resultado:" + resultado);
    }

    private static void subtracao() {
        double num1, num2, resultado;
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("  Subtração   ");
        System.out.println("------------------");

        System.out.println("Digite um número:");
        num1 = scan.nextDouble();
        System.out.println("Digite um número:");
        num2 = scan.nextDouble();

        resultado = num1 - num2;

        System.out.println("Resultado:" + resultado);
    }

    private static void multiplicacao() {
        double num1, num2, resultado;
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("  Multiplicação   ");
        System.out.println("------------------");

        System.out.println("Digite um número:");
        num1 = scan.nextDouble();
        System.out.println("Digite um número:");
        num2 = scan.nextDouble();

        resultado = num1 * num2;

        System.out.println("Resultado:" + resultado);
    }

    private static void divisao() {
        double num1;
        double num2;
        double resultado;
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("  Divisão   ");
        System.out.println("------------------");

        System.out.println("Digite um número:");
        num1 = scan.nextDouble();
        System.out.println("Digite um número:");
        num2 = scan.nextDouble();

        if(num2 == 0 || num2 < 0){
            System.out.println("Digite um número:");
            num2 = scan.nextDouble();
            resultado = num1/num2;
            System.out.println("O resultado é:" + resultado);
        } else {
            resultado = num1/num2;
            System.out.println("O resultado é:" + resultado);
        }
    }


    public static void main(String[] args) {
        int opcao;
        opcao = Menu_func();
        System.out.println("Opção selecionada foi: " + opcao);

        if(opcao != 9 || opcao != 0){
            switch (opcao){
                case 1: adicao(); break;
                case 2: subtracao(); break;
                case 3: multiplicacao(); break;
                case 4: divisao(); break;
            }
        }
    }
}
