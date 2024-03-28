//Faça um programa que leia um nome de usuário e a sua senha e não aceite senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.


import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Crie sua senha: ");
            String senha = scanner.nextLine();

            if (senha.equals(nome)) {
                System.out.println("O nome não pode ser igual a senha");
            } else {
                break;
            }


        }
        
        
        scanner.close();
    }
}
