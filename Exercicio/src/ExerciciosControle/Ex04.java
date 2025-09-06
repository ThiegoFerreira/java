package ExerciciosControle;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		/**
		 * 4. Criar um programa que receba um número e diga se ele é um número primo.
		 */
		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}

		scanner.close();
	}

}
