public class Metodos {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Alex";
        String segundoNome = "Santos";

        String nomeCompleto = retornarNomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String retornarNomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
