import java.util.Scanner;
public class Programa08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        


        double soma = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println("Digite o " + (i + 1) + " numero : ");
        double n = scanner.nextDouble();
        soma = soma + n;
        }
        double media = soma / 5;

        System.out.println("SOMA DOS NUMEROS = " + soma);
        System.out.println("MEDIA DOS NUMEROS " + media);
        scanner.close();
    }    
}