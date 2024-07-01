public class ContaPoupanca extends Conta {
    
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprirExtrato(){
        System.out.println("=== Extrato conta Corrente ===");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Conta: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }
}
