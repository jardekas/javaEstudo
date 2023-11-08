package conditional_exercise;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalNegPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Insira um valor inteiro:");
		int V = sc.nextInt();
		
		if (V < 0) {
			System.out.println(V+" Negativo");
		}
		else {
			System.out.println(V+" Positivo");
		}
		sc.close();
	}

}
