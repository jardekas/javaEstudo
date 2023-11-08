package whiles_exeercise;

import java.util.Locale;
import java.util.Scanner;

public class Senha_Leitura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Entre com sua senha de 4 digitos:");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.println("Insira novamente sua senha:");
			
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		
		sc.close();
	}

}
