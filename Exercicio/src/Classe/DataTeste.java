package Classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		var d2 = new Data(31, 12, 2020);
/*		date.dia = 19;
		date.mes = 10; */
		d2.ano = 1987; 
		//System.out.printf("O meu aniversário é %d/%d/%d.",dt.dia,dt.mes,dt.ano);
		
		String dataFormatada = d1.obterData();
		
		System.out.println(dataFormatada);
		System.out.println(d2.obterData());
	}

}
