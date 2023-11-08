package conditional_exercise;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Entre com um Valor Inteiro:");
		
		int V = sc.nextInt();
		
		if(V % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
		sc.close();
	}

}
