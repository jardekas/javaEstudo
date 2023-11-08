package for_exercise;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor fatorial: ");
		int count = sc.nextInt();
		int N = 1;
		
		for (int i = 1; i <= count; i++) {
				
				N *= i;
		}
			System.out.println("Fatorial de "+ count + " = " + N);
		
		
		 		
		sc.close();
	}
}

