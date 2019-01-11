package exercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int ano;

		System.out.print("Digite um ano: ");
		ano = ler.nextInt();
		ler.close();

		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("Esse ano é um ano bissexto!");
		} else {
			System.out.println("Esse ano não é um ano bissexto!");
		}

	}

}
