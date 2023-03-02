import java.util.Scanner;

public class Pergunta2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int fibonacci = 0, fibonacci1 = 0, fibonacci2 = 1, numero;

        System.out.print("Informe um número: ");
        numero = leitor.nextInt();

        while (fibonacci < numero) {
            fibonacci = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci;
        }

        if (fibonacci == numero){
            System.out.println("Número informado pertence a sequência fibonacci.");
        }else {
            System.out.println("Número informado NÃO pertence a sequência fibonacci.");
        }

    }
}
