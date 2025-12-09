package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Leite";
		p1.preco = 12.00;
		
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 20.56;
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.2);
		double mediaCarrinho = (precoFinal1 + precoFinal2 )/ 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);

	}
}
