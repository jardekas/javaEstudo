package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class CotacaoDollar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What's the Dollar price? ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("How many dollars will the bougth? ");
		double converterMoeda = sc.nextDouble();
		
		double result = CurrencyConverter.conversorMoeda(precoDolar, converterMoeda);
		
		System.out.printf("Amount to be paid in reais = %.2f", result);
		sc.close();
	}

}
