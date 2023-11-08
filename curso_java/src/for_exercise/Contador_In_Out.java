package for_exercise;

import java.util.Scanner;

public class Contador_In_Out {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a Quantidade de Repeticoes");
		
		int in = 0;
		int out = 0;
		int X = 0;
		int count = sc.nextInt();
		
		System.out.println("insira os "+ count + " valores");
		for(int i=0; i < count; i++) {
			X = sc.nextInt();
			
			if(X >= 10 && X <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println(in + " In");
		System.out.println(out + " out");
		
		
		sc.close();
	}

}
