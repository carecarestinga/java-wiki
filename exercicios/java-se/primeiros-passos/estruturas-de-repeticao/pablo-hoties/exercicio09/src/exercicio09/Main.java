package exercicio09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		double media;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			soma += numero;
		}
		
		media = soma / 5;
		ler.close();
		
		System.out.println("A soma é: " + soma + " e a média é: " + media);
	}
}
