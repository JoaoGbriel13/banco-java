public abstract class Conta implements iConta{

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    private static double taxaSaque = 6.50;

    private static double taxaDeposito = 4.20;

    protected  int agencia;
    protected int numero;
    protected double saldo;

    protected  Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor - taxaSaque;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor - taxaDeposito;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar();
        contaDestino.depositar();
    }

    protected void infosConta() {
        System.out.println(String.format("Cliente : %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia : %d", this.agencia));
        System.out.println(String.format("Numero : %d", this.numero));
        System.out.println(String.format("Saldo : %.2f", this.saldo));
    }
}
