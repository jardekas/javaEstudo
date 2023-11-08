package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Calculo_Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee sal = new Employee();
		
		System.out.print("Insira o nome do funcionario: ");
		sal.name = sc.nextLine();
		System.out.print("Insira o Valor do Salario(Gross Salary): ");
		sal.grossSalary = sc.nextDouble();
		System.out.print("Insira o Valor das taxas(Tax): ");
		sal.tax = sc.nextDouble();
		
		System.out.print("Employee: "+sal);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		
		double percentagem = sc.nextDouble();
		sal.increaseSalary(percentagem);
		
		System.out.println("Updated data: "+ sal);

		sc.close();
	}

}
