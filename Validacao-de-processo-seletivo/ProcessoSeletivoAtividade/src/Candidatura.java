import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Candidatura {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
        
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRalizadas =1;
        boolean continuarTentando =true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRalizadas++;
            else
                System.out.println("Contato Realizado com sucesso");

        }while(continuarTentando && tentativasRalizadas <3);
    
        if(atendeu)
            System.out.println("Conseguimos contatos com " + candidato + " na "+ tentativasRalizadas + " tentativa ");
         else
            System.out.println("Não conseguimos contato com " + candidato + " , numero maximo de tentativas "+  tentativasRalizadas + " Realizadas ");   

    }

    static boolean atender() {
		return new Random().nextInt(3)==1;
    }
    
    static void selecionarCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice=0; indice < candidatos.length;indice++){
            System.out.println(" O candidato de n°  " +(indice+1) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each ");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi "+ candidato);
    
        }
    }



    static void selecaoCandidatos(){
        String [] candidatos ={"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};
    int candidatosSelecionados =0;
    int candidatoAtual=0;
    double salarioBase=2000.0;
    while (candidatosSelecionados < 5 && candidatoAtual <candidatos.length) {
        String candidato= candidatos[candidatoAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
        if (salarioBase >= salarioPretendido) {
            System.out.println(" O candidato " + candidato+ " foi selecionado para a vaga ");
            candidatosSelecionados++;
            
        }
        candidatoAtual++;
    }
    
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}