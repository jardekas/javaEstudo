package for_exercise;

import java.util.Scanner;

public class Positivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número de linhas:");
		int N = sc.nextInt();
		
		if(N > 0) {
			for (int i = 1; i <= N; i++ ) {
				System.out.print(i+" ");
				System.out.print(Math.pow(i, 2)+" ");
				System.out.println(Math.pow(i, 3));
			}
		} 
		else {
			System.out.println("Use Valores positivos maiores que zero.");
		}
		
		sc.close();
	}

}
