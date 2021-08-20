import Entities.Cliente;
import Entities.Conta;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Cliente jose = new Cliente();
        jose.setNome("José");

        Cliente antonia = new Cliente();
        antonia.setNome("Antônia");

        Conta cc = new ContaCorrente(jose);
        cc.depositar(100);
        cc.imprimirExtrato();

        Conta poupanca = new ContaPoupanca(antonia);
        poupanca.depositar(50);

        cc.transferir(150,poupanca);
        poupanca.sacar(200);
        poupanca.imprimirExtrato();
    }
}
