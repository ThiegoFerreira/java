package fundamentos;

public class Inferência {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		// não se pode inferir uma variavel de outro tipo 
		var b = 4.5;
		System.out.println(b);
		// var = inferência 
		var c = "texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; //variável declarada
		d = 123.65; // variável incializada
				System.out.println(d); // variável usada!
				
	}

}
