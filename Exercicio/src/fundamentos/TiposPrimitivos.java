package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações do funcionário
		// tipos numéricos inteiros
		byte AnosDeEmpresa = 23; // range(faixa) -128 até +127 8bits
		short numeroDeVoos = 542;// range (faixa) -32.768 até +32.767 16bits
		int id = 56789; //range (faixa) -2.147.483.648 até +2.147.483.647 32bits
		long pontosAcumulados = 3_234_845_223L; // range -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807 64bits
		//Literal long precisa de L no final.
		//Tipos numéricos reais
		float salário = 11_445.44F; // número fracional até 7 casas decimais.
		double vendasAcumuladas = 2_991_797_103.01;
		//Tipo booleano
		boolean estaDeFerias = false; // ou true
		//Tipo caractere
		char status = 'A';
		//Dias de empresa 
		System.out.println(AnosDeEmpresa * 365);
		//Números de viagens
		System.out.println(numeroDeVoos/2);
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		// Valor do sálario
		System.out.println(id + ": ganha -> " + salário);
		//Está de férias
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status: " + status);
	}

}
