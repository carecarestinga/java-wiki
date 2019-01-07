package exercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double nota1;
		double nota2;
		double soma;
		double resultado;

		System.out.print("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		ler.close();
		soma = nota1 + nota2;
		resultado = soma / 2;

		if (resultado == 10.0) {
			System.out.println("Aprovado com Distinção!");
		} else if (resultado >= 7.00) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
