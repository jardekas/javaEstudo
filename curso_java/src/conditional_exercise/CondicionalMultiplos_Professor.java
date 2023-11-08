package conditional_exercise;

import java.util.Scanner;

public class CondicionalMultiplos_Professor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com dois Valores Inteiros");
		System.out.println("1o. Valor: ");
		int A = sc.nextInt();
		System.out.println("2o. Valor: ");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não São Multiplos");
		}
		sc.close();
	}

}
