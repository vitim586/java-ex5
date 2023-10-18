import java.util.Scanner;

public class PerimetroQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        int b = 4;

        int product = a * b;
        System.out.print("Digite o comprimento do quadrado: ");
        int numero = scanner.nextInt();

        System.out.println("O perimetro do quadrado é: " + product);
    }
}
