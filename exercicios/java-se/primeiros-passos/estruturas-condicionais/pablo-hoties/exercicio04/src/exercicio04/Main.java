package exercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		char letra, letraCaixaAlta;

		System.out.print("Digite uma letra (em minúsculo): ");
		letra = ler.next().charAt(0);
		ler.close();
		letraCaixaAlta = Character.toUpperCase(letra);

		switch (letraCaixaAlta) {
		case 'A':
			System.out.println("Você digitou uma vogal");
			break;

		case 'E':
			System.out.println("Você digitou uma vogal");
			break;

		case 'I':
			System.out.println("Você digitou uma vogal");
			break;

		case 'O':
			System.out.println("Você digitou uma vogal");
			break;

		case 'U':
			System.out.println("Você digitou uma vogal");
			break;

		default:
			System.out.println("Você digitou uma consoante");

		}

	}
}
