package fundamentos;

public class DesafiosAritmeticos {
	public static void main(String[] args) {
		
		
		double num1 = Math.pow(6 * (3 + 2), 2);
		double den1 = 3 * 2;
		double num2 = (1 - 5) * (2 - 7);
		double den2 = 2;
		double superior1 = num1/den1;
		double superior2 = Math.pow(num2/den2, 2);
		double superiorFinal = Math.pow(superior1-superior2, 3);
		double inferiorFinal = Math.pow(10, 3);
		
		double resultado = superiorFinal/inferiorFinal;
		System.out.println(resultado);
	}
}
