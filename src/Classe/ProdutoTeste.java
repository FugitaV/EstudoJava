package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Leite";
		p1.desconto = 0.3;
		p1.preco = 5.00;
		
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.desconto = 0.5;
		p2.preco = 12.56;
		
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		System.out.println(p2.desconto);
		
		double precoFinal1 = p1.preco * (1- p1.desconto);
		double precoFinal2 = p2.preco * (1- p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2 )/ 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	}
}
