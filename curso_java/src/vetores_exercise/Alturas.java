package vetores_exercise;

import java.util.Locale;
import java.util.Scanner;

import entities.Entities_Alturas;

public class Alturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double medAltura = 0;
		double percIdade = 0;
		String nome;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Entities_Alturas[] vect = new Entities_Alturas[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Entities_Alturas(nome,idade,altura);
			
			//Acumulação media da altura
			medAltura += vect[i].getAltura();
			//Acumulação para percentual da idade
			if(vect[i].getIdade() < 16) {
				percIdade++;
			}
			
		}
		

		System.out.printf("Altura media: %.2f%n",(medAltura/n));
		System.out.println("Pessoas com menos de 16 anos: "+(percIdade/n*100)+"%");
		
		for(int i = 0; i<vect.length;i++) {
			if(vect[i].getIdade() < 16) {
			System.out.printf("%s\n",vect[i].getNome());
			}
		}
		sc.close();
	}

}
