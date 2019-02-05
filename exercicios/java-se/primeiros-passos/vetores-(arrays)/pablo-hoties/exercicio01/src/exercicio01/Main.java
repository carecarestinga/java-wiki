package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[5];

		System.out.println("Preenchendo o Vetor A");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite o valor do índice " + i + " : ");
			vetorA[i] = entrada.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i];
		}

		System.out.println("\n\nMostrando o conteúdo do vetor B");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Índice " + i + " valor = " + vetorB[i]);
		}

		entrada.close();
	}

}
