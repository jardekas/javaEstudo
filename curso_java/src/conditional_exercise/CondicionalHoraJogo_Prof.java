package conditional_exercise;

import java.util.Scanner;

public class CondicionalHoraJogo_Prof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira hora inicial do Jogo:");
		int A = sc.nextInt();
		System.out.println("Insira hora final do Jogo:");
		int B = sc.nextInt();
		
		if(A < B) {
			int tot = B - A;
			System.out.println("O Jogo durou "+tot+" Hora(s)");
		}
		else {
			int tot = 24 - A + B;
			System.out.println("O Jogo durou "+tot+" Hora(s)");
		}
		sc.close();
	}

}
