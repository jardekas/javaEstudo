package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Rectangular_Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle X;
		X = new Rectangle();
		
		
		System.out.println("Enter rectangle width and height:");
		X.width = sc.nextDouble();
		X.height = sc.nextDouble();
		
		Double areaR = X.area();
		Double periR = X.perimeter();
		Double diagR = X.diagonal();
		
		System.out.printf("Area: %.2f%n", areaR);
		System.out.printf("Perimetro: %.2f%n", periR);
		System.out.printf("Diagonal: %.2f%n", diagR);
		
		sc.close();
	}

}
