import java.util.Scanner;

public class Pergunta5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a palavra a ser invertida: ");
        String palavra = leitor.next();

        String invertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + invertida);
    }
}