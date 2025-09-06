package ExerciciosControle;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		/** 5. Refatorar o exercício 04, utilizando a estrutura switch. */

		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " é um número primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  não é um número primo.");

		}

		scanner.close();
	}

}
