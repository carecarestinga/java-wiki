package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[5];

		System.out.println("Preenchendo o Vetor A");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite o valor do �ndice " + i + " : ");
			vetorA[i] = entrada.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i];
		}

		System.out.println("\n\nMostrando o conte�do do vetor B");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("�ndice " + i + " valor = " + vetorB[i]);
		}

		entrada.close();
	}

}
