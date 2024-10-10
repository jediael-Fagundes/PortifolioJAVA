/*Exercício B - Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade
de funcionários e os salários, e devolvendo a média salarial.*/
import java.util.Scanner;
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double salario = 0;
		double media = 0;
		System.out.println("Digite o salario o total de funcionarios ");
		int funcionarios = scanner.nextInt();
		
		for(int i = 1; i <= funcionarios; i++) {
			System.out.println("Digite o salario do funcionario " + i + ":");
			 salario = scanner.nextDouble();
			media = media + salario;
		}

		media =(media / funcionarios);
		
	
	
		
		
		System.out.printf("Média salarial = %.2f", media);
		scanner.close();
				
		
	}

}
