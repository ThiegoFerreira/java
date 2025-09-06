package Controle;

public class Switch {
	public static void main(String[] args) {
/* Switch é a função de escolhas. O caso a seguir é pouco usual
 * pois o switch geralmente determina um ponto de "break" para que,
 * após a escolha de "case" o código saia do bloco. No caso a seguir
 * por não haver um break, um case leva aos seguintes, sendo acumulativo.
 */
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan.");
		case "roxa":
			System.out.println("Sei o Heian Godan.");
		case "verde":
			System.out.println("Sei o Heian Yodan.");
		case "laranja":
			System.out.println("Sei o Heian Sandam.");
		case "vernmelha":
			System.out.println("Sei o Heian Nidam.");
		case "amarela":
			System.out.println("Sei o Heian Shodan.");
		}
		
	}

}
