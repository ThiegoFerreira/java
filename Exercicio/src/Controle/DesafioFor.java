package Controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
		/* A forma de utilizar o For sem controladores númericos
		 * é utilizando uma String e a limitação do contador 
		 * fica a cardo da notação !v.equals("enquanto v for diferente da
		 * expressão determinada, o loop prossegue)
		 */
		
	}

}
