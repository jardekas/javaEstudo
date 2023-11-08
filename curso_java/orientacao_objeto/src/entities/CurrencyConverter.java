package entities;

public class CurrencyConverter {

	public static final double TAX = 0.06;
	
	/*public void valorEmReal(double tax) {
		converterMoeda += precoDolar * converterMoeda * TAX;
	}*/
	
	public static double conversorMoeda(double precoDolar, double converterMoeda) {
		return precoDolar * converterMoeda + precoDolar * converterMoeda * TAX;
	}
}
