/* 
 * Desenvolvido por Jediael Fagundes
 * Exercício 3 – Solicita ao usuário que digite seu nome e idade, 
 * e exibe uma mensagem com essas informações.
 */

import java.util.Scanner;

public class EntradaESaida {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite seu nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê o nome fornecido

        // Solicita ao usuário que digite sua idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê a idade fornecida

        // Exibe uma mensagem com as informações fornecidas
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        // Fecha o scanner
        scanner.close();
    }
}
