package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class AreaPoligono {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
			double A, B, C, pi, Atri, ACir, Atra, Aqua, Aret;
			A = sc.nextDouble();
			B = sc.nextDouble();
		    C = sc.nextDouble();
			pi = 3.14159;
			
			Aret = A * B;
			Aqua = Math.pow(B, 2);
			Atra = (A+B)*C/2;
			ACir = pi * Math.pow(B, 2);
			Atri = A * C / 2;
			
			
			System.out.printf("TRIANGULO: %.3f%n", Atri);
			System.out.printf("CIRCULO: %.3f%n", ACir);
			System.out.printf("TRAPEZIO: %.3f%n", Atra);
			System.out.printf("QUADRADO: %.3f%n", Aqua);
			System.out.printf("RETANGULO: %.3f%n", Aret);
			
			
	sc.close();
	}

}
