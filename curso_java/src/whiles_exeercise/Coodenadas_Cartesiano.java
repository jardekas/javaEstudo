package whiles_exeercise;

import java.util.Scanner;

public class Coodenadas_Cartesiano {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a Coordenada X: ");
		int X = sc.nextInt();
		System.out.print("Entre com a Coordenada Y: ");
		int Y = sc.nextInt();
		
		while(X != 0 && Y != 0) {
						
			if(X > 0 && Y > 0) {
				System.out.println("Primeiro Quadrante");
			}
			else if(X < 0 && Y > 0) {
				System.out.println("Segundo Quadrante");
			}
			else if(X < 0 && Y < 0) {
				System.out.println("Terceiro Quadrante");
			}
			else {System.out.println("Quarto Quadrante");}
			
			System.out.print("Entre com a Coordenada X: ");
			X = sc.nextInt();
			System.out.print("Entre com a Coordenada Y: ");
			Y = sc.nextInt();
		}
		
		sc.close();
	}

}
