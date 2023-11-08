package vetores_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		double vectMediaPar = 0;
		int parQte = 0;
		
		for(int i = 0; i < vect.length; i++) {
		System.out.print("Digite um numero: ");
		vect[i] = sc.nextInt();
		
		//calcular as médias
		if(vect[i] % 2 == 0) {
		vectMediaPar += vect[i];
		parQte++;
		}
		
		}
		if(vectMediaPar > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", (vectMediaPar = vectMediaPar/parQte));
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		sc.close();
	}

}
