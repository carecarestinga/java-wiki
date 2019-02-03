package exercicio32;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double salario = 1000;
		double percentual = 1.5;
		salario += (salario / 100) * percentual;
		
		DecimalFormat formata = new DecimalFormat("###,###.##");
		
		for (int i = 1997; i <= 2019; i++) {
			percentual = 3;
			salario += (salario / 100) * percentual;
			System.out.println(i + " = " + formata.format(salario) + " - " + percentual + "%");
			//System.out.printf("%d - %.2f - %.0f%n", i, salario, percentual);
		}
		
	}	
}
