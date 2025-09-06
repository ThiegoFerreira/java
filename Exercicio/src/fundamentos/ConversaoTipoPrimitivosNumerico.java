package fundamentos;

public class ConversaoTipoPrimitivosNumerico {
	
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.12345;// Parenteses (conversao explícita)antes do valor de atribuição faz uma conversao ao tipo específicado.
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // conversão explícita
		System.out.println(d);
		
		double e = 1.0;
		int f = (int) e;
		System.out.println(f);
	
		
		
	}

}
