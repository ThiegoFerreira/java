package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comproutv50 = trabalho1&&trabalho2;
		boolean comproutv32 = trabalho1^trabalho2;
		boolean comprousorvete = trabalho1||trabalho2;
		boolean maissaudavel = !comprousorvete; // Operador Unário
		
		System.out.println("Comprou TV 50\"?" + comproutv50); //Barra invertida(scape) dentro de aspas duplas para exibir uma aspas dulpla dentro de uma string
		System.out.println("Comprou TV 32\"?" + comproutv32);
		System.out.println("Comprou TV 32\"Sorvete?" + comproutv50);
		
		System.out.println("Mais saudavel?"+ maissaudavel);
	
		
		
		
		
	}

}
