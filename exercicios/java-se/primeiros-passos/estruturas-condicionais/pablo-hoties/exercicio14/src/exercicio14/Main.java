package exercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double nota1;
		double nota2;
		double soma;
		double media;
		char conceito = 0;

		System.out.print("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		ler.close();
		soma = nota1 + nota2;
		media = soma / 2;

		if (media >= 9.0 && media <= 10.0) {
			conceito = 'A';
		} else if (media >= 7.5 && media <= 8.9) {
			conceito = 'B';
		} else if (media >= 6.0 && media <= 7.4) {
			conceito = 'C';
		} else if (media >= 4.0 && media <= 5.9) {
			conceito = 'D';
		} else if (media <= 4.0 && media >= 0.0) {
			conceito = 'E';
		}

		switch (conceito) {
		case 'A':
		case 'B':
		case 'C':
			System.out.printf(
					"A primeira nota é: %.1f e a segunda nota é: %.1f que totalizou na média: %.1f e com essa média você está aprovado e com o conceito: %s ",
					nota1, nota2, media, conceito);
			break;

		case 'D':
		case 'E':
			System.out.printf(
					"A primeira nota é: %.1f e a segunda nota é: %.1f que totalizou na média: %.1f e com essa média você está reprovado e com o conceito: %s ",
					nota1, nota2, media, conceito);
			break;

		default:
			System.out.println("Faustão: ErrRrrRrrrOOoOuUuU mentiroso!");
		}
	}

}
