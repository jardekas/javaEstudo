package conditional_exercise;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalImposto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Dados de Imposto de Renda:");
		System.out.println("Renda: R$ 0.00 a R$ 2000.00    - Isento");
		System.out.println("Renda: R$ 2000.01 a R$ 3000.00 - Taxa:  8%");
		System.out.println("Renda: R$ 3000.01 a R$ 4500.00 - Taxa: 18%");
		System.out.println("Renda: acima de R$ 4500.00     - Taxa: 28%");
		System.out.println();
		System.out.println("Insira sua Renda:");
		Double Sal = sc.nextDouble();
		Double IR;
		
		if ( Sal <= 2000.00 ) {
			IR = 0.00;
		}
		else if ( Sal <= 3000.00 ) {
			IR = (Sal - 2000.00)*0.08;
		}
		else if ( Sal <= 4500.00) {
			IR = Sal - 2000;
			IR = ((IR - 1000)*0.18)+(1000*0.08);
		}
		else {
			IR = ((Sal - 4500)*0.28)+(1500*0.18)+(1000*0.08);
		}
		
		if (IR == 0) {
			System.out.printf("Isento");
		}
		else {
			System.out.printf("Imposto de Renda: R$ %.2f%n", IR);
		}
		sc.close();
	}

}
