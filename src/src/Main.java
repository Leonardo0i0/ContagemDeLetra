import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean opcao = true;
        String escolha, texto;

        do {
            System.out.print("Digite uma string: ");
            texto = teclado.next();


            String resultado = contagem.contarLetraA(texto);
            System.out.println(resultado);

            do {
                System.out.println("Deseja continuar? (S/N)");
                escolha = teclado.next();
                if (!escolha.equalsIgnoreCase("S") && !escolha.equalsIgnoreCase("N")) {
                    System.out.println("Opção inválida, por favor insira uma opção válida.");
                }
            } while (!escolha.equalsIgnoreCase("S") && !escolha.equalsIgnoreCase("N"));

            if (escolha.equalsIgnoreCase("N")) {
                opcao = false;
            }
        }while(opcao);


        teclado.close();
    }
}