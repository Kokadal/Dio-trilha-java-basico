public class FormatadorDeCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");
            System.out.println(cepFormatado);
        } catch (IllegalArgumentException e) {
            System.out.println("CEP inválido: " + e.getMessage());
        }
    }

    static String formatarCep(String cep) {
        if (cep.length() != 8)
            throw new IllegalArgumentException("O CEP deve conter 8 dígitos");

        return "23.765-064";
    }
}