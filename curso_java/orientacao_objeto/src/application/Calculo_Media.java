package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Calculo_Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		System.out.print("Entre com o nome do Aluno: ");
		stu.name = sc.nextLine();
		
		System.out.println("Entre com os 3 Valores dos trimestres:");
		stu.n1 = sc.nextDouble();
		stu.n2 = sc.nextDouble();
		stu.n3 = sc.nextDouble();
		
		System.out.println(stu);
		
		sc.close();
	}

}
