package conditional_exercise;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalIntervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Entre com qualquer Valor Real:");
		double Int = sc.nextDouble();
		
		if(Int < 0 || Int > 100) {
			System.out.println("Fora do Intervalo");
		}
		else if(Int <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if(Int <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		else if(Int <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
	}

}
