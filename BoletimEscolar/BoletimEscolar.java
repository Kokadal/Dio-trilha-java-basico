package Doug.Roberth.Segundasemana;

import java.util.Scanner;

public class BoletimEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("7");
        double nota = scanner.nextDouble();
        
        if (nota >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            if (nota <= 7.0)
            System.out.println("Aluno reprovado.");
        }
        
        scanner.close();
}

}
