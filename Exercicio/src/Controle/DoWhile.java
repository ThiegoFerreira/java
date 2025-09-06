package Controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		// if(...) sentrença; ou {}
		// while(....) sentença; ou {}
		// for(variável;expressão;modificação) sentença; ou {}
		
		//do{} while(....); única que termina em ;
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar " 
					+ "a palavra mágica...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado! ");
		
		entrada.close();
	}

}
