package Controle;

public class For3 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {// váriavel i está dentro do escopo de for e somente ali.
			System.out.println(i);
		}
		int i = 0; // para utilizar a váriavel i deve retirar da chave for.
		System.out.println("Saiu do for");
		System.out.println(i);
	
	}
}
