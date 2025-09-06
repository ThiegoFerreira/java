package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			valor = entrada.nextLine();
		}
		
	// Valores indeterminados é sempre interessante utilizar while
	//Valores determinados é sempre interessante utilizar for	
		
		entrada.close();
		
	}

}
