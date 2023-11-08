package vetores_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		int vectA[] = new int[n];
		int vectB[] = new int[n];
		int vectC[] = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vectC.length; i++ ) {
			vectC[i] = vectA[i]+vectB[i];
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}

}
