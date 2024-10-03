/* 
 * Desenvolvido por Jediael Fagundes
 * Exercício 2 – Verifica se um número fornecido pelo usuário é par ou ímpar.
 */

import java.util.Scanner;

public class Condição {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt(); // Lê o número fornecido

        // Condição para verificar se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
