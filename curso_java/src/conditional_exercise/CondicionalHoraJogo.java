package conditional_exercise;

import java.util.Scanner;

public class CondicionalHoraJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a hora inicial e final do jogo");
		System.out.println("Hora Inicial:");
		int A = sc.nextInt();
		System.out.println("Hora Final:");
		int B = sc.nextInt();
		
		if(A < B) {
			int tot = B - A;
			System.out.println("O jogo durou " + tot +" horas;" );
		}
		else{
			int tot = 24 - A + B;
			System.out.println("O jogo durou " + tot +" horas;" );
		}
		
		sc.close();
	}

}
