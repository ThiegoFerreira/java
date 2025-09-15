package Classe;

public class Produtoteste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4000.00); // utilizando contrutor com parâmetros

		var p2 = new Produto();//utilizando construtor sem parâmetros, setando as variáveis (código maior)
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 +precoFinal2) /2;
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
	}

}
