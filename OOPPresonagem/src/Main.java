import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite 1 iniciar: ");
        System.out.print("Digite 0 para sair: ");

        int opcao = scan.nextInt();
        while (opcao != 0){
           System.out.println("------------------");
           System.out.println("  Mario Kart - Personagens   ");
           System.out.println("------------------");
           System.out.println("1- Mario");
           System.out.println("2- Peach");
           System.out.println("3- Luigi");
           System.out.println("4- Toad");
           System.out.println("0- SAIR");
           System.out.println("------------------");


           System.out.print("Selecione um personagem: ");
           int nomeperso = scan.nextInt();
           if (nomeperso != 0) {
               switch (nomeperso) {
                   case 1:
                       personagem.setNomePersonagem("Mario");
                       break;
                   case 2:
                       personagem.setNomePersonagem("Peach");
                       break;
                   case 3:
                       personagem.setNomePersonagem("Luigi");
                       break;
                   case 4:
                       personagem.setNomePersonagem("Toad");
                       break;
                   default:
                       System.out.println("Opção inválida");
               }
           }
           System.out.println("Personagem escolhido: " + personagem.getNomePersonagem());
           scan.nextLine();

           System.out.println("------------------");
           System.out.println("1- Bombinhas");
           System.out.println("2- Casca de banana");
           System.out.println("3- Vida");
           System.out.println("4- Casco do bowser");
           System.out.println("0- SAIR");
           System.out.println("------------------");
           System.out.print("Selecione um item: ");
           int nomeItem = scan.nextInt();

           String itemSelecionado = "";
           if (nomeItem != 0) {
               switch (nomeItem) {
                   case 1:
                       personagem.setNomeItem("Bombinhas");
                       itemSelecionado = "Bombinhas";
                       personagem.adicionaItem(itemSelecionado);
                       break;
                   case 2:
                       personagem.setNomeItem("Casca de banana");
                       itemSelecionado = "Casca de banana";
                       personagem.adicionaItem(itemSelecionado);
                       break;
                   case 3:
                       personagem.setNomeItem("Vidas");
                       itemSelecionado = "Vidas";
                       personagem.adicionaItem(itemSelecionado);
                       break;
                   case 4:
                       personagem.setNomeItem("Casco do bowser");
                       itemSelecionado = "Casco do bowser";
                       personagem.adicionaItem(itemSelecionado);
                       break;
                   default:
                       System.out.println("Opção inválida");
               }
           }

           System.out.println("Quantidade de itens: " + personagem.getQtdItens());
           System.out.println("Velocidade: " + personagem.getVelocidade());

           System.out.print("Digite um valor para acelerar: ");
           int acelera = scan.nextInt();
           personagem.acelerar(acelera);

           System.out.print("Digite um valor para desacelerar: ");
           int desacelera = scan.nextInt();
           personagem.desacelerar(desacelera);

           personagem.utilizarItem(itemSelecionado, personagem.qtdItens);

           System.out.print("Digite 0 para sair ou 1 para continuar: ");
           opcao = scan.nextInt();
       }
    }
}

