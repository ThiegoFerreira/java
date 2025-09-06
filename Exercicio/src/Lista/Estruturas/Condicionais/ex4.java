package Lista.Estruturas.Condicionais;

import java.util.Scanner;

public class ex4 {
	
	/* Crie um programa que receba três números e mostre-os se estão 
	 * em ordem crescente.
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("1)Informe o primeiro número:");
		double num1 = entrada.nextDouble();
		System.out.print("2)Informe o segundo número:");
		double num2 = entrada.nextDouble();
		System.out.print("3)Informe o terceiro número:");
		double num3 = entrada.nextDouble();
		
		if(num1<num2&&num2<num3){
			System.out.println("Os números estão em ordem crescente!");
		}else {
			System.out.println("Os números não estão em ordem crescente");
		}
		System.out.println("Fim!");
		entrada.close();
	}

}
