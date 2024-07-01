public class Main {

    public static void main(String[] args) {
        Cliente Douglas = new Cliente();
        Douglas.setNome("Douglas");



        Conta corrente = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        corrente.imprimirExtrato();
        poupanca.imprirExtrato();

    }

}
