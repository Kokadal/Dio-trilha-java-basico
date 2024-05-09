import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao banco Roberth. O que podeos fazer por você hoje? Por favor, digite COMEÇAR para entrar em sua conta");
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

            double limiteSaque = 50.00;

        // Verificando a opção escolhida pelo usuário
        if (acesso.equalsIgnoreCase("SALDO")) {
            System.out.println("Seu saldo disponível é de R$ " + limiteSaque);
        } else {
            System.out.println("Opção inválida!");
        }

        // Se o usuário escolher sacar, continua com a lógica do saque
        if (acesso.equalsIgnoreCase("SALDO")) {
            System.out.println("Por favor, informe o valor que deseja sacar");
            double valorSolicitado = scanner.nextDouble();

            if (limiteSaque >= valorSolicitado) {
                limiteSaque -= valorSolicitado;
                System.out.println("Transação realizada com sucesso! Novo saldo: R$ " + limiteSaque);
            } else {
                System.out.println("Saldo insuficiente");
            }

            scanner.close();


       }
    }
}
