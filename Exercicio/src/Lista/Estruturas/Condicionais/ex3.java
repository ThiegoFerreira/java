package Lista.Estruturas.Condicionais;

import javax.swing.JOptionPane;

public class ex3 {
	
	public static void main(String[] args) {
/*Crie um programa que receba dois números e mostre qual deles é o maior.*/
		
	String num1 = JOptionPane.showInputDialog("Informe o primeiro valor");
	String num2 = JOptionPane.showInputDialog("Informe o segundo valor");
	
	double res1 = Double.parseDouble(num1);
	double res2 = Double.parseDouble(num2);
	
	if(res1>res2) {
		System.out.println(res1+" é maior que "+res2);
	}else if (res2>res1){
		System.out.println(res2+" é maior que "+res1);
	}
	
	
	}

}
