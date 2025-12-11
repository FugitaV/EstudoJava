package arrays;


public class Foreach {
	public static void main(String[] args) {
		double[] notas = { 9.9 , 8.7, 9.9, 7.2};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		for (double d : notas) {
			System.out.println(d);
		}
	}
}
