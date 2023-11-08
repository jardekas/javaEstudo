package vetores_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double mediaVect = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			mediaVect += vect[i];
		}
		
		System.out.printf("MEDIA DO VETOR = %.3f", (mediaVect = mediaVect/n));
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < vect.length; i++) {
			if(mediaVect > vect[i]) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
