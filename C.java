/*Exercício C - Informar um saldo e imprimir o saldo com reajuste de 1%*/
import java.util.Scanner;
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double salario, reajuste, result;
		System.out.println("Digite o salario ");
		 salario = scanner.nextDouble();
		 
		 reajuste = (salario *1)/100;
		 
		 result = salario + reajuste;
		 
	
		 System.out.println("Salario reajustado "+ result);
		 scanner.close();
	}

}
