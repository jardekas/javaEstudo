package whiles_exeercise;

import java.util.Scanner;

public class Erp_Combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, Informe o combustível desejado:");
		System.out.println("1 - Alcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Fim");
		
		int Alc = 0; 
		int Gas = 0; 
		int Die = 0;
		int Ent = sc.nextInt();
		
		while(Ent != 4) {
			if (Ent == 1) {
				Alc += 1;
			}
			else if (Ent == 2) {
				Gas += 1;
			}
			else if(Die == 3){
				Die += 1;
			}
			
			Ent = sc.nextInt();
		}

		System.out.println("Muito Obrigado");
		System.out.printf("Alcool: %d%n", Alc);
		System.out.printf("Gasolina: %d%n", Gas);
		System.out.printf("Diesel: %d%n", Die);
		sc.close();
	}

}
