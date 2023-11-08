package conditional_exercise;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalPdv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Selecione o ítem desejado:");
		System.out.println("Código: 1 - Cachorro quente - R$ 4,00");
		System.out.println("Código: 2 - X-Salada - R$ 4,50");
		System.out.println("Código: 3 - X-Bacon - R$ 5,00");
		System.out.println("Código: 4 - Torrada Simples - R$ 2,00");
		System.out.println("Código: 5 - Refrigerante - R$ 1,50");
		System.out.print("Código: ");
		int id = sc.nextInt();
		double valor = 0.00;
		
		if (id == 1) {
			valor = 4.00;
		}
		else if (id == 2) {
			valor = 4.50;
		}
		else if (id == 3) {
			valor = 5.00;
		}
		else if (id == 4) {
			valor = 2.00;
		}
		else if (id == 5) {
			valor = 1.50;
		}
		
		System.out.println("Entre com a Quantidade desejada: ");
		int Qte = sc.nextInt();
		
		double total = (double) valor * Qte;
		
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}

}
