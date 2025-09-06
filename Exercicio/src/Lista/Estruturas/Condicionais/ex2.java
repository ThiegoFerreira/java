package Lista.Estruturas.Condicionais;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {

/*  Crie um programa que receba um número inteiro e verifique se ele é maior que 10 se sim, 
imprima: é maior que 10, senão imprima: é menor que 10.*/
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um número inteiro:");
	int num1 = entrada.nextInt();
	if(num1>=10) {
		System.out.println("Maior que 10.");
	}else {
		System.out.println("Menor que 10.");
	}
	
	entrada.close();
		
	}

}
