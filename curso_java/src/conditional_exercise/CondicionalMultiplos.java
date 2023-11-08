package conditional_exercise;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalMultiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int V1, V2, V3;
		System.out.println("Entre com Dois Valores Inteiros:");
		System.out.println("Valor 01:");
		V1 = sc.nextInt();
		System.out.println("Valor 02:");
		V2 = sc.nextInt();
		
		if( V1 < V2 ) {
		
			V3 = V1;
			V1 = V2;
			V2 = V3;	
		}
		
		if (V1 % V2 == 0) {
			System.out.println("São Multiplos");
		}	
		else {
			System.out.println("Não São Multiplos");
		}
		
		sc.close();
	}

}
