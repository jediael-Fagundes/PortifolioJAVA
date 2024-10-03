/* 
 * Desenvolvido por Jediael Fagundes
 * Exercício 4 – Solicita ao usuário que digite um nome e 
 * exibe o nome armazenado em um vetor.
 */

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração de um vetor para armazenar 1 nome
        String[] nome = new String[1];

        // Solicita ao usuário que digite um nome
        System.out.print("Digite um nome: ");
        nome[0] = scanner.nextLine(); // Lê o nome fornecido e armazena no vetor

        // Exibe o nome armazenado
        System.out.println("Nome digitado: " + nome[0]);

        // Fecha o scanner
        scanner.close();
    }
}
