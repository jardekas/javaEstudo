package vetores_exercise;

import java.util.Locale;
import java.util.Scanner;

import entities.Entitie_Dados;

public class Dados_pessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double mediaFem = 0;
		int contFem = 0;
		int contMas = 0;
		double altMax = 0;
		double altMin = 0;

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Entitie_Dados[] dados = new Entitie_Dados[n];
		
		for(int i = 0; i < dados.length; i++) {
			sc.nextLine();
			System.out.println("Altura da "+(1+i)+"a pessoa: ");
			double altura = sc.nextDouble();
			System.out.println("Genero da "+(1+i)+"a pessoa: ");
			char genero = sc.next().charAt(0);
			dados[i] = new Entitie_Dados(altura,genero);
			
			if(genero == 'F' || genero == 'f') {
				mediaFem += altura;
				contFem++;
			}
			else {
				contMas++;
			}
						
		}
		
		altMin = dados[0].getAltura();
		
		for(int i = 0; i < dados.length; i++) {
			
			if(dados[i].getAltura() > altMax) {
				altMax = dados[i].getAltura();
			}
			else if(dados[i].getAltura() < altMin){
				altMin = dados[i].getAltura();
			}	
		}
		
		System.out.printf("Menor altura = %.2f%n", altMin);
		System.out.printf("Maior altura = %.2f%n", altMax);
		System.out.printf("Media das alturas das mulheres = %.2f%n", (mediaFem/contFem));
		System.out.print("Numero de homens = " + contMas);
		
		
		
		
		sc.close();
	}

}
