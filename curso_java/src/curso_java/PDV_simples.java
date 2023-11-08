package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class PDV_simples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Entre com o cod. Produto 1:");
		int cod1 = sc.nextInt();
		System.out.println("Entre com a Quantidade:");
		int qt1 = sc.nextInt();
		System.out.println("Entre com o Valor 1: R$");
		double val1 = sc.nextDouble();
		
		System.out.println("Entre com o cod. Produto 2:");
		int cod2 = sc.nextInt();
		System.out.println("Entre com a Quantidade");
		int qt2 = sc.nextInt();
		System.out.println("Entre com o Valor 2: R$");
		double val2 = sc.nextDouble();
		
		double total = (double)qt1*val1+qt2*val2;
		
		System.out.printf("Valor a Pagar: R$ %.2f%n", total);
		
		sc.close();

	}

}
