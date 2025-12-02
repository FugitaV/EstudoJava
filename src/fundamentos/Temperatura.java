package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		//formula : (F - 32) x 5/9 = C
		
		double fahrenheit = 86;
		double formula = 5.0 / 9.0;
		double ajuste = 32;
		double grausCelsius = (fahrenheit - ajuste) * formula;
		
		System.out.println(grausCelsius);
	}
}
