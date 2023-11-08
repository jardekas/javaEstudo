package for_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Media_Ponderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Insira a quantidade de numeros para calcular a Media Ponderada:");
		
		int count = sc.nextInt();
		
		System.out.println("Entre com os " + count + " Valores para calcular Media Ponderada:");
		
		for (int i=0; i < count; i++) {
			
			double P1 = sc.nextDouble();
			double P2 = sc.nextDouble();
			double P3 = sc.nextDouble();

			double MP = (P1*2 + P2*3 + P3*5)/10;
			System.out.printf("Media Ponderada: %.1f%n", MP);
		}
		
		
		sc.close();
	}

}
