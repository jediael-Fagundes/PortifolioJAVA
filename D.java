/*Exercício D - Desenvolva um algoritmo em Java que leia um número inteiro e imprima
o seu antecessor e seu sucessor.*/
import java.util.Scanner;
public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero ");
		int num = scanner.nextInt();
		System.out.println("o numero é "+num);
		System.out.println("Antecessor :"+ (num -1));
		System.out.println("Sucessor :"+ (num +1));
		scanner.close();
	}

}
