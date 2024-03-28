import java.util.Scanner;
public class Programa07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double maiorN = 0;

        for (int i = 0; i <= 4; i++) {
        System.out.println("Digite o " + (i + 1) + " numero : ");
        double n = scanner.nextDouble();
            if (n > maiorN) {
                maiorN = n;
            }
        }

            System.out.println("O maior valor é: " + maiorN);

        scanner.close();
    }    
}