package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Entre com o ID do funcionário:");
		int idFun = sc.nextInt();
		System.out.println("Quantidade de horas trabalhadas:");
		double HE = sc.nextDouble();
		System.out.println("Valor das horas trabalhadas R$:");
		double VHE = sc.nextDouble();
		
		double total = HE * VHE;
		
		System.out.println("Number: "+idFun);
		System.out.printf("Salary: R$ %.2f%n", total);
	
		sc.close();

	}

}
