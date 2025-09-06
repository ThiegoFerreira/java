package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;// a = a + 1;
		a--;// a = a - 1;
		
		++b;// b = b + 1;
		--b;// b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--);// o java observa a prescedência. o ++ antes do a seignifica pressa.
		System.out.println(a == b);//... então no momento da compração o valor de a e b é igual, mesmo que ele
									//... faça a incrementação depois.
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
