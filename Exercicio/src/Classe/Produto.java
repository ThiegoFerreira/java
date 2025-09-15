package Classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto() { //Construtor sem parâmetro (Pode funcionar junto com o construtor com parâmetros)
		
	}
	
	Produto(String nomeInicial) { //Construtor com parâmetro
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial) { //Construtor com vários parâmetros
		nome = nomeInicial;
		preco = precoInicial;
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
