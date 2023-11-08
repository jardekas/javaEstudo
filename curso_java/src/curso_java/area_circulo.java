package curso_java;

import java.util.Scanner;

public class area_circulo {

	public static void main(String[] args) {
		System.out.println("Insira o Valor do Raio:");
		Scanner sc = new Scanner(System.in);
		//Locale.setDefault(Locale.US);
		
		
		
		double R = sc.nextDouble();		
		
		double area = Math.PI*(Math.pow(R, 2));
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
