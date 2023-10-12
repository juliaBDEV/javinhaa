public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Julia";
        String segundoNome = "Brandão";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    private static void extracted(String nomeCompleto) {
        System.out.println(nomeCompleto);
    }

    /**
     * @param primeiroNome
     * @param segundoNome
     * @return
     */
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);

    }
}

