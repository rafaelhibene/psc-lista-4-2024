import java.util.Scanner;
public class Programa05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paisA;
        int paisB;
        int anos = 0;
        double taxaA;
        double taxaB;

        do {
            System.out.println("Digite a população do primeiro pais: ");
            paisA = scanner.nextInt(); 
            System.out.println("Digite a população do segundo pais: ");
            paisB = scanner.nextInt();
        } while (paisA > paisB);


        do {
            System.out.println("Digite a taxa de crescimento do primeiro pais: ");
            taxaA = scanner.nextDouble();
            System.out.println("Digite a taxa de crescimento do segundo pais: ");
            taxaB = scanner.nextDouble();
        } while (taxaA > taxaB);


        
        while (paisA <= paisB) {
            paisA += (int) (paisA * taxaA);
            paisB += (int) (paisB * taxaB);
            anos++;
        }


        System.out.println("Serão necessarios " + anos + " anos para que o pais A ultrapasse o pais B");

        scanner.close();
    }    
}
