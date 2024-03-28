import java.util.Scanner;
public class Programa10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int n2 = scanner.nextInt();

        System.out.println("Numeros entre " + n1 + " e " + n2);
        for (int i = n1 + 1; i < n2; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
