//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;


        while (true) {
        System.out.println("Digite uma nota entre 0 e 10");
        nota = scanner.nextInt();
        
        if (nota >= 0 && nota <= 10) {
            break;
        } else {
            System.out.println("Valor invalido, o valor deve estar entre 0 e 10");
        }
    }

        scanner.close();
    }

}