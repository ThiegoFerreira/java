package Lista.Estruturas.Condicionais;

import java.util.Scanner;

public class ex6 {
/* Crie um Programa que pergunte em que turno você estuda. 
 * Peça para digitar M - Matutino ou VVespertino ou N - Noturno. 
 * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou
 * "Valor Inválido!", conforme o caso.
 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe qual turno você estuda. M para matutino,"
				+ " V para vespertino ou N para noturno:");
		String periodo = entrada.next();
		
		if (periodo.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		}else if(periodo.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
		}else if(periodo.equalsIgnoreCase("n")) {
			System.out.println("Boa noite");
		}else {
			System.out.println("Valor inválido!");
		}
		
		entrada.close();
	}

}
