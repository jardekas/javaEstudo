package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Atividades_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		 int tot = A + B;
		
		System.out.println("Soma = "+ tot);
		
		
		
		
		sc.close();

	}

}
