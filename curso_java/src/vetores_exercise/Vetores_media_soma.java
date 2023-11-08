package vetores_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_media_soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double sum = 0.00;
		double med = 0.00;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
				
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		System.out.print("VALORES = ");
		for(int i =0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		med = (double)sum / n;
		
		System.out.printf("\nSOMA = %.2f", sum);
		System.out.printf("\nMEDIA = %.2f", med);

		sc.close();
	}

}
