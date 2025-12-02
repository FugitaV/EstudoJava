package fundamentos;

import java.util.Scanner;

public class DesafioCalculadoraModulo1 {
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

	        System.out.print("Num1: ");
	        double n1 = sc.nextDouble();

	        System.out.print("Num2: ");
	        double n2 = sc.nextDouble();

	        System.out.print("Operação (+ - * /): ");
	        char op = sc.next().charAt(0);

	        boolean soma = (op == '+');
	        boolean sub  = (op == '-');
	        boolean mult = (op == '*');
	        boolean div  = (op == '/');

	        double resultado =
	            (soma ? (n1 + n2) : 0) +
	            (sub  ? (n1 - n2) : 0) +
	            (mult ? (n1 * n2) : 0) +
	            (div  ? (n1 / n2) : 0);

	        System.out.println("Resultado: " + resultado);
	        sc.close();
	}
}
