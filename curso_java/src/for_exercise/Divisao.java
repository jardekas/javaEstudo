package for_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Entre com a quantidade de de vezes a calculadora ira rodar:");
		
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.println("Entre com o Dividendo: ");
			int dividendo = sc.nextInt();
			System.out.println("Entre com o Divisor: ");
			int divisor = sc.nextInt();
			
			if (divisor == 0 ) {
				System.out.println("Impossivel Divisao");
			}
			else {
				double resultado = (double) dividendo / divisor;
				System.out.printf("Resultado: %.1f%n", resultado);
			}
		}

		sc.close();
	}

}
