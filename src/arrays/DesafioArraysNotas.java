package arrays;

import java.util.Scanner;

public class DesafioArraysNotas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas notas voce deseja inserir??");
		int quantidade = sc.nextInt();
		
		double[] notas = new double[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite a nota:");
			notas[i] = sc.nextDouble();
			
		}
		
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		
		double media = total / quantidade;
		
		System.out.println("A sua media foi de :" + media);
		
	}
}
