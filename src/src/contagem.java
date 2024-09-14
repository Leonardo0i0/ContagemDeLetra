public class contagem {
    public static String contarLetraA(String texto) {
        int contagem = 0;

        texto = texto.toLowerCase();


        for (char c : texto.toCharArray()) {
            if (c == 'a') {
                contagem++;
            }
        }

        if (contagem > 0) {
            return "A letra 'a' ocorre " + contagem + " vez(es) na string.";
        } else {
            return "A letra 'a' não ocorre na string.";
        }
    }
}
