/*Exercício G - Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse
número. Fatorial de N é representado por N! e calculado da seguinte maneira: ��! = �� ∗ (�� − 1) ∗ (�� − 2) ∗. . .∗
3 ∗ 2 ∗ 1 Utilize o laço que lhe for mais conveniente.*/
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número maior que 0:");
        int N = scanner.nextInt();
        
        
        if (N <= 0) {
            System.out.println("Por favor, digite um número maior que 0.");
        } else {
           double fatorial = 1;
            for (int i = 1; i <= N; i++) {
                fatorial *= i; // Cálculo do fatorial
            }
            System.out.println("O fatorial de " + N + " é " + fatorial);
        }
        
        scanner.close();
    }
}