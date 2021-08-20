package Entities;

public interface IConta {
    //todos os métodos são públicos
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
