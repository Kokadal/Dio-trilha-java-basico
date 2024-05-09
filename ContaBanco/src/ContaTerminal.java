import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao banco Roberth. O que podeos fazer por você hoje? Por favor, digite começar para entrar em sua conta");
        String começar = scanner.next();

        System.out.println("Por favor, me diga seu nome:");
            String nome = scanner.next();

            System.out.println("Agora, digite o número da agência Roberth: ");
            String agencia = scanner.next();
            
            System.out.println("Bacana, agora digite o número da conta Roberth: ");
            int conta = scanner.nextInt();
            
            System.out.println("Execelente " + nome + " por favor, digite a sua senha, aquela utilizada para acesso na Internet");
            String senha = scanner.next();

            System.out.println("Acesso autorizado " + nome + ", Bem vinde. No momento, sua conta tem apenas a opção Saque disponivel. Para consultar o valor digite SALDO");
            String acesso = scanner.next();

            System.out.println("R$50,00 ");
            double saldo = scanner.nextDouble();

            System.out.println("Seu limite disponivel saque é de" + saldo );

            scanner.close();


    }
}
