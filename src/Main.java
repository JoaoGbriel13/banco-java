public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        Cliente alberto = new Cliente();
        Cliente laura = new Cliente();
        Cliente maria = new Cliente();

        joao.setNome("Joao");
        alberto.setNome("Alberto");
        laura.setNome("Laura");
        maria.setNome("Maria");

        Conta cc = new ContaCorrente(joao);
        Conta cp = new ContaPoupanca(laura);
        

        cc.depositar(100);;
        cc.sacar(50);

        cc.infosConta();
        cp.infosConta();
    }
}
