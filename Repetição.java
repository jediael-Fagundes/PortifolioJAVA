/* 
 * Desenvolvido por Jediael Fagundes
 * Exercício 1 – Leia um valor inteiro X (1 <= X <= 1000).
 * Em seguida, mostre os ímpares de 1 até X, valor por linha, inclusive o 
 * X se for o caso.
 */

import java.util.Scanner;

public class Repetição {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X;
        
        System.out.println("Digite um numero: ");
        X = (int) scanner.nextDouble();

        if (X >= 1 && X <= 1000) { // Verifica se X está dentro do intervalo permitido
            for (int i = 1; i <= X; i++) {
                if (i % 2 != 0) { // Verifica se o número é ímpar
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Por favor, insira um número entre 1 e 1000.");
        }
        
        scanner.close(); // Fecha o scanner apenas uma vez, fora do loop
    }
}
