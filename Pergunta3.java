import java.util.Scanner;

public class Pergunta3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1 = 2;

        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 7; i++) {
            System.out.print(num1 + " ");
            num1 *= 2;
        }

        System.out.println();
        for (int i = 0; i <= 7; i++) {
            System.out.print(i * i + " ");
        }

        System.out.println();


        int numero = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                numero = (int) Math.pow(i, 2);
                System.out.print(numero + " ");
            }
        }
        System.out.println();

        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 7; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println();
        int num = 2;
        for (int i = 2; i <= 7; i++) {
            System.out.print(num + " ");
            if (i == 2) {
                num = 10;
            } else if (i == 3) {
                num = 12;
            } else if (i == 4) {
                num = 16;
            } else if (i == 5) {
                num = 17;
            } else if (i == 6) {
                num = 18;
            }
        }
        System.out.print("19 200");

    }

}
