import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Number valor = 0; // Inicializando com um valor padrão
        
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) { // Corrigindo a sintaxe do bloco catch
            e.printStackTrace(); // Movendo o printStackTrace() para dentro do bloco catch
        }
        
        System.out.println(valor);
    }
}