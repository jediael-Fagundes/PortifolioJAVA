/*Exercício F - Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus
divisores positivos próprios (excluindo-o) é igual ao próprio número. Por exemplo o número 6 é perfeito, pois
1+2+3 é igual a 6. Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou
não. Utilize o laço que lhe for mais conveniente.*/
import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero: ");
        int num = scanner.nextInt();
        
        int soma = 0;

 
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }

   
        if (soma == num) {
            System.out.println(num + " é um número perfeito.");
        } else {
            System.out.println(num + " não é um número perfeito.");
        }

        scanner.close(); 
}
}
