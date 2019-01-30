package exercicio25;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double precoDoPao;
		
		System.out.println("Digite qual será o preço do pão?");
		precoDoPao = ler.nextDouble();
		ler.close();
		
		for (int i = 1; i <= 50; i++) {
			System.out.printf("%d - R$%.2f%n", i, (precoDoPao * i));
		}
	}
}
