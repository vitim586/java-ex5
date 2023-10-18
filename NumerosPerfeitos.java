import java.util.Scanner;

public class NumerosPerfeitos {

    public static boolean eNumeroPerfeito(int numero) {
        int somaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (eNumeroPerfeito(numero)) {
            System.out.println("O número é perfeito.");
        } else {
            System.out.println("O número não é perfeito.");
        }
    }
}
