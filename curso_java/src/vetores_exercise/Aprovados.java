package vetores_exercise;

import java.util.Locale;
import java.util.Scanner;

import entities.Entitie_Aprovado;

public class Aprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		Entitie_Aprovado[] boletim = new Entitie_Aprovado[n];

		
		for(int i = 0; i < boletim.length; i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do "+(1+i)+"o aluno:");;
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			boletim[i] = new Entitie_Aprovado(nome,nota1,nota2);
		}
		
		System.out.println("Alunos aprovados:");
		
		for(int i = 0; i < boletim.length; i++) {
			
			double media = (boletim[i].getNota1() + boletim[i].getNota2())/2 ;
			if(media >= 6) {
			System.out.println(boletim[i].getNome());
			}
		}
		
		sc.close();
	}

}
