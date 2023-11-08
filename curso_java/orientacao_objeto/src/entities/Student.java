package entities;

public class Student {

	public String name;
	public double n1, n2, n3;
	
	public double notaFinal() {
		return n1+n2+n3;
	}
	
	public String result() {
		if(notaFinal() >= 60) {
			return " PASS";
		}
		else { return " FAILED\n" 
			+"MISSING " 
			+ String.format("%.2f",(60.00 - notaFinal()))
			+ " Points";}
	}
	
	public String toString() {
		return "FINAL GRADE = "
				+ String.format("%.2f", notaFinal())
				+ result();
	}
	
}
