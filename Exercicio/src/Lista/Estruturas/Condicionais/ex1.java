package Lista.Estruturas.Condicionais;

import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) {
		
/* Crie um programa que leia 2 números inteiros e 1 real. Calcule e mostre: o produto do primeiro 
com a metade do segundo, a soma do triplo do primeiro com o terceiro. O terceiro número
digitado ao cubo.*/
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite um número inteiro: ");
	double num1 = entrada.nextDouble();
	System.out.print("Digite um segundo número inteiro: ");
	double num2 = entrada.nextDouble();
	System.out.print("Informe um número real: ");
	double num3 = entrada.nextDouble();
	
	double res = num1 * (num2/2);
	double res2 = (num1 * 3) + num3;
	double res3 = Math. pow(num3, 3);
	
	System.out.println("O produto do primeiro número "
			+ "com a metade do segundo é"+ res);
	System.out.println("A soma do triplo do primeiro"
			+ "com o terceiro é" + res2);
	System.out.println("O número três elevado ao cubo é" + res3);
	
	entrada.close();
	}

}
