/*Exercício A - Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba
em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C +
273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
*/
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



Scanner scanner = new Scanner(System.in);
		double celsius,F,K,Re,Ra;
		
		System.out.println("Digite a temperatura: ");
		celsius = scanner.nextDouble();
		
		F = (celsius * 1.8) + 32;
		
		K = celsius + 273.15;
		
		Re= celsius * 0.8;
		Ra = (celsius * 1.8) + 32 + 459;
		
		
		System.out.printf(" celsius para Fahrenheit %.2f :",F);
		
		System.out.printf(" celsius para Kelvin %.2f :",K);
		System.out.printf(" celsius para Réamur %.2f :",Re);
		System.out.printf(" celsius para Rankine %.2f :",Ra);
		scanner.close();
	}

}
