package vetores_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Mais_Velho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int j = 0;
		int comp = 0;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] vectN = new String[n];
		int[] vectI = new int[n];
		
		for(int i = 0; i < vectN.length; i++) {
			sc.nextLine();
			System.out.println("Dados da "+(i+1)+"a pessoa: ");
			System.out.print("Nome: ");
			vectN[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectI[i] = sc.nextInt();
			
			if(vectI[i] > comp) {
				comp = vectI[i];
				j = i;
				
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: "+ vectN[j]);
		
		
		sc.close();
	}

}
