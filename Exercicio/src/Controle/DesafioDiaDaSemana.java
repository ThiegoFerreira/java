package Controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Dia 1");
		} else if (dia.equalsIgnoreCase("segunda")){
			System.out.println("Dia 2");
		} else if (dia.equalsIgnoreCase("terça") ||
				dia.equalsIgnoreCase("terca")) {
			System.out.println("Dia 3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("Dia 4");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Dia 5");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Dia 6");
		} else if(dia.equalsIgnoreCase("sabado") ||
				dia.equalsIgnoreCase("sábado")) {
			System.out.println("Dia 7");
		}	
		
		entrada.close();
    	}
	}

