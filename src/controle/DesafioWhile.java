package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        double nota = 0;

        System.out.println("Digite as notas dos alunos de 0 a 10");
        System.out.println("Digite -1 para encerrar.");

        while (nota != -1) {
            System.out.print("Nota: ");
            nota = entrada.nextDouble();

            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Digite entre 0 e 10.");
                continue; 
            }

            soma += nota;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.printf("Média das notas: %.2f", media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        entrada.close();
    
	}
}
