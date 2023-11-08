package for_exercise;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor que deseja saber seus divisores:");
		int N = sc.nextInt();
		System.out.println("Divisores:");
		for(int i=1; i<=N; i++) {
			if (N % i == 0) {
				
				System.out.println(i);
			}
		}
		
		
		
		sc.close();
	}

}
