package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunosA = new double [4];
		notasAlunosA[0] = 7.9;
		notasAlunosA[1] = 8.0;
		notasAlunosA[2] = 6.7;
		notasAlunosA[3] = 9.0;
		
		
		System.out.println(Arrays.toString(notasAlunosA));
		
		int total = 0;
		for(int i = 0; i < notasAlunosA.length; i++) {
			total += notasAlunosA[i];
		}
		
		System.out.println(total / notasAlunosA.length);
		
		double[] notasAlunosB = { 6.9, 8.9, 5.5, 9.2 };
		
		double totalAlunoB = 0;
		
		for(int i = 0; i < notasAlunosB.length; i++) {
			totalAlunoB += notasAlunosB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunosB.length);
		
	}
}
