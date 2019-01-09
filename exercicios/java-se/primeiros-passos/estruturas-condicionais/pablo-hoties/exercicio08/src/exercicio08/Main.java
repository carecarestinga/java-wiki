package exercicio08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double preco1;
		double preco2;
		double preco3;
		
		System.out.print("Digite o valor do primeiro produto: ");
		preco1 = ler.nextDouble();
		System.out.print("Digite o valor do segundo produto: ");
		preco2 = ler.nextDouble();
		System.out.print("Digite o valor do terceiro produto: ");
		preco3 = ler.nextDouble();
		ler.close();
		
		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("O produto com o primeiro preço está mais barato: " + preco1);
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("O produto com o segundo preço está mais barato: " +  preco2);
		} else if (preco3 <= preco2 && preco3 <= preco1) {
			System.out.println("O produto com o terceiro preço está mais barato: " + preco3);
		}
		
	}
}
