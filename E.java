/*Exercício E - Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura
de senha incorreta informada, escrever a mensagem &quot;Senha Invalida&quot;. Quando a senha for informada
corretamente deve ser impressa a mensagem &quot;Acesso Permitido&quot; e o algoritmo encerrado. Considere que a
senha correta é o valor 2002. Utilize o laço que lhe for mais conveniente.*/
import java.util.Scanner;
public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		for(int i = 1; i <= 3; i++) {
		System.out.println("Digite a senha ");
		double senha = scanner.nextDouble();
		
		if(senha != 2002){
			System.out.println("&quot;Senha Invalida&quot");
			
		
	
		}else {
			System.out.println("&quot;Acesso Permitido&quot ");
			break;
		}
		scanner.close();
				
	}
	}
}


