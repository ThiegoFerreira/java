package Lista.Estruturas.Condicionais;

import java.util.Scanner;

public class ex5 {

	/*Crie um Programa que verifique se uma letra digitada é "F" ou "M". 
	 * Conforme a letra escreva: 
	 * F - Feminino, M – Masculino ou Sexo Inválido.*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite M para masculino e "
				+ "F para feminino:");
		String sexo = entrada.next();
				
		if(sexo.equalsIgnoreCase("m")) {
			System.out.print("Sexo Masculino.");
		} else if (sexo.equalsIgnoreCase("f")) {
			System.out.print("Sexo Feminino");	
		} else {
			System.out.println("Sexo inválido");
		}
		entrada.close();
	}

}
