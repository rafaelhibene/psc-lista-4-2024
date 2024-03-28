import java.util.Scanner;

public class Programa03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        do {
            System.out.println("Digite seu nome (deve ser maior que 3 caracteres)");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        int idade;
        do {
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        double salario;
        do {
            System.out.println("Digite seu salario: ");
            salario = scanner.nextDouble();
        } while (salario > 0);

        char sexo;
        do {
            System.out.println("Digite seu sexo (F ou M): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'F' && sexo != 'M');

        char estadoCivil;
        do {
            System.out.println("Digite seu estado civil ('S', 'c', 'V' ou 'D')");
            estadoCivil = scanner.next().charAt(0);
        } while (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'V');

        System.out.println("\nInformações validadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}
