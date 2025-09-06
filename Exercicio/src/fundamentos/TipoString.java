package fundamentos;

import java.io.Reader;

// O Tipo String é um dos objetos mais utilizados no Java depois dos tipos primitivos.
// Todos os Tipos utilizados em Java, com excessão dos tipos primitivos
// são "objetos". 

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2)); //charAt colocação de caractere conforme o indíce informado no charAt
		
		// String é um objeto imutavel, passivel de ações:
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!")); // concat = concatenação (junção)
		System.out.println(s+"!!!"); // + = .concat
		System.out.println(s.startsWith("Boa")); // s.startswith (Verdadeiro ou falso)
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa")); // .tolowercase (para minusculas) .startsWith (começa com)
		System.out.println(s.endsWith("tarde")); // .endsWith (termina com)
		System.out.println(s.length()); //.length(comprimento)Quantos caracteres possui a String?
		System.out.println(s.equals("boa tarde")); // comparação de igualdade boolean
		System.out.println(s.equalsIgnoreCase("boa tarde")); // .equalsignorecase não considera maius. minus.
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " 
				+ sobrenome + "\nIdade:" + idade +
				"\nsalario: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario); // %s = string, %d = inteiro, %f = float/double 
		//(acrescente .1,.2,.3 para definir quantas casas decimais mostrar do numeral)
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual")); //"Contém"True ou false
		System.out.println("Frase qualquer".indexOf("qual")); // em qual índice contém a palavra "qual"
		System.out.println("Frase qualquer".substring(6)); // .substring = Ínicia a string no índice informado
		System.out.println("Frase qualquer".substring(6, 10)); //. substring pode iniciar quanto terminar a string
		
	
	}

}
