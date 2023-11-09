package vetores_exercise;

import java.util.Locale;
import java.util.Scanner;

import entities.Entitie_Pensionato;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Entitie_Pensionato[] pensio = new Entitie_Pensionato[10];
		
		for(int i = 1; i < n ; i++) {
			sc.nextLine();
			System.out.println("Rent #"+i);
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			pensio[quarto] = new Entitie_Pensionato(nome,email,quarto);
		}
				
		System.out.println("Busy rooms:");
		for(int i = 1; i < 10; i++) {
			
			if(pensio[i] != null) {
				System.out.println(pensio[i].getQuarto() + ": " + pensio[i].getNome() + ", " + pensio[i].getEmail());
			}
		}

		sc.close();
	}

}
