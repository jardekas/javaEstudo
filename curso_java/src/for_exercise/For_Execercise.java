package for_exercise;

import java.util.Scanner;

public class For_Execercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um Valor no Intervalo: 1 <= X <= 1000");

		int X = sc.nextInt();
		int Imp = 0;

		System.out.println("Numeros Impares:");
		if (X >= 1 && X <= 1000) {
			for (int i = 1; i <= X; i++) {

				if (i % 2 != 0) {
					Imp = i;
					System.out.println(Imp);
				}

			}
		} else {
			System.out.println("Valor Fora do Intervalo");
		}

		sc.close();
	}

}
