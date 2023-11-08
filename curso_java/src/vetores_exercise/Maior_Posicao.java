package vetores_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Posicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double PosMaior = 0;
		int LocaleMaior = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double vect[] = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if(PosMaior < vect[i]) {
				PosMaior = vect[i];
				LocaleMaior = i;
			}
		}
		
		
		System.out.printf("MAIOR VALOR = %.1f", PosMaior);
		System.out.println("\nPOSICAO DO MAIOR VALOR = " + LocaleMaior);
		
		
		sc.close();
	}

}
