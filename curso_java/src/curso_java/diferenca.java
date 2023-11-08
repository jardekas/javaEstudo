package curso_java;

import java.util.Scanner;

public class diferenca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o Primeiro Valor");
		int A = sc.nextInt();
		System.out.println("Entre com o Segundo Valor");
		int B = sc.nextInt();
		System.out.println("Entre com o Terceiro Valor");
		int C = sc.nextInt();
		System.out.println("Entre com o Quarto Valor");
		int D = sc.nextInt();
		
		int dif = (A * B - C * D);
		
		System.out.println("Diferenca = " + dif);	
		
		
		sc.close();
	}

}
