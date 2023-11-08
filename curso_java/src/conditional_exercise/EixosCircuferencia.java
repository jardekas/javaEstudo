package conditional_exercise;

import java.util.Locale;
import java.util.Scanner;

public class EixosCircuferencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Entre com as Coordenadas no plano Cartesiano:");
		System.out.print("Eixo X: ");
		Double X = sc.nextDouble();
		System.out.print("Eixo Y: ");
		Double Y = sc.nextDouble();
		
		if (X == 0 && Y == 0) {
			System.out.println("Origem");
		}
		else if (X == 0 ) {
			System.out.println("Eixo Y");
		}
		else if (Y == 0 ) {
			System.out.println("Eixo X");
		}
		else if (X >= 0 && Y > 0) {
			System.out.println("Q1");
		}
		else if (X < 0 && Y > 0) {
			System.out.println("Q2");
		}
		else if (X < 0 && Y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();
	}

}
