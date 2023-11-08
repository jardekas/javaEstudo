package vetores_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int qteP = 0;
			
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES: ");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 ==0) {
				qteP++;
				System.out.print(vect[i]+" ");
			}
		}
		
		System.out.println();
		System.out.print("\nQUANTIDADE DE PARES = " + qteP);

		sc.close();
	}

}
