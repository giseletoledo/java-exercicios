package Entities;

//classe abstrata não pode ser instanciada
public abstract class Conta implements IConta {

    //todas que herdam de conta enxergam as propriedades protected
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    //composição
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //implementa a interface IConta
    @Override
    public void sacar(double valor) {
        if(saldo >= 0 && valor <= this.saldo){
            saldo -= valor;
            System.out.println(saldo);
        } else {
            System.out.println("Saldo insuficiente para sacar");
        }

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Foi depositado o valor " + valor + " na conta de " + this.cliente.getNome());
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        //saca da conta atual e deposita na conta destino
        if(this.saldo > 0 && valor <= this.saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência");
        }
    }

    protected void ImprimirDadosConta() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d",this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    //Getters
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
