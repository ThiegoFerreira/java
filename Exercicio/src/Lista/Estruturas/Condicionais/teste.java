package Lista.Estruturas.Condicionais;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.next();
		System.out.println("Olá "+nome+", tudo bem? ");
		String pergunta1 = entrada.next();
		if (pergunta1 == "Tudo") {
			System.out.print("Que bom!");
		} else {
			System.out.println();
		}
			
		
		entrada.close();
		
	}

}
