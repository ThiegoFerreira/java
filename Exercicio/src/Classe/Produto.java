package Classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto() { //Construtor sem parâmetro (Pode funcionar junto com o construtor com parâmetros)
		
	}
	
	Produto(String nomeInicial) { //Construtor com parâmetro
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial) { //Construtor com vários parâmetros
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}

	double precoComDesconto() {
		return preco * (1-desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
