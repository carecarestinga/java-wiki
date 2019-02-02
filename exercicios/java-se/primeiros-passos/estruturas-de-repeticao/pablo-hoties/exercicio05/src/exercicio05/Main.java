package exercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		boolean valido = false;
		double populacaoA = validarPopulacaoA(ler, valido);
		double populacaoB = validarPopulacaoB(ler, valido);
		double taxaA = armazenarTaxaA(ler, valido);
		double taxaB = armazenarTaxaB(ler, valido);
		
		int quantidadeAnos = 0;
		
		while (populacaoA < populacaoB) {
			populacaoA += populacaoA * taxaA;
			populacaoB += populacaoB * taxaB;
			quantidadeAnos++;
		}
		
		System.out.println("População A: " + populacaoA);
		System.out.println("População B: " + populacaoB);
		System.out.println("Anos: " + quantidadeAnos);

	}

	private static double armazenarTaxaB(Scanner ler, boolean valido) {
		double taxaB;
		do {
			System.out.println("Digite qual vai ser o valor da taxa B: ");
			taxaB = ler.nextDouble();
			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa B precisa ser maior do que zero!");
			}
		} while (!valido);
		return taxaB;
	}

	private static double armazenarTaxaA(Scanner ler, boolean valido) {
		double taxaA;
		do {
			System.out.println("Digite qual vai ser o valor da taxa A: ");
			taxaA = ler.nextDouble();
			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa A precisa ser maior do que zero!");
			}
		} while (!valido);
		return taxaA;
	}

	private static double validarPopulacaoB(Scanner ler, boolean valido) {
		double populacaoB;
		do {
			System.out.println("Digite a quantidade de pessoas da população B: ");
			populacaoB = ler.nextDouble();
			if (populacaoB > 0) {
				valido = true;
			} else {
				System.out.println("A população A precisa ser maior do que zero!");
			}
		} while (!valido);
		return populacaoB;
	}

	private static double validarPopulacaoA(Scanner ler, boolean valido) {
		double populacaoA;
		do {
			System.out.print("Digite a quantidade de pessoas da população A: ");
			populacaoA = ler.nextDouble();
			if (populacaoA > 0) {
				valido = true;
			} else {
				System.out.println("A população A precisa ser maior do que zero!");
			}
		} while (!valido);
		return populacaoA;
	}

}
