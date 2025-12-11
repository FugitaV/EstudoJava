package DesafioModulo1;

public class Jantar {
	public static void main(String[] args) {
		
		Comida feijao = new Comida("Feijao", 0.234);
		
		Comida arroz = new Comida("Arroz", 0.450);
		Comida carne = new Comida("Carne", 0.500);
		
		Pessoa p1 = new Pessoa("Vitor", 70);
		
		System.out.println(p1.nome + " " + p1.peso + "kg");
		System.out.println(feijao.nomeComida + " " + feijao.valorKj);
		System.out.println(arroz.nomeComida + " " + arroz.valorKj);
		System.out.println(carne.nomeComida + " " + carne.valorKj);
		
		p1.comer(carne, arroz, feijao);
		
		System.out.println("Após jantar: " + p1.nome + ", está pesando: " + String.format("%.2f", p1.peso)  + "kg");
	}
}
