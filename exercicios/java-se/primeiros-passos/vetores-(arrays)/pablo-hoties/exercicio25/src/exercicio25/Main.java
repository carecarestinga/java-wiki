package exercicio25;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um n�mero inteiro que estar� no vetorA e no ind�ce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		System.out.println("");
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um n�mero inteiro que estar� no vetorB no ind�ce " + p + " : ");
			vetorB[p] = ler.nextInt();
		}
		ler.close();
		System.out.println("");
		for (int p = 0; p < vetorA.length; p++) {
			if (vetorA[p] > vetorB[p]) {
				vetorC[p] = 1;
			} else if (vetorA[p] == vetorB[p]) {
				vetorC[p] = 0;
			} else {
				vetorC[p] = -1;
			}
		}
		System.out.println("Exibindo todos os ind�ces do vetor V:");
		for (int p = 0; p < vetorC.length; p++) {
			System.out.println(vetorC[p]);
		}
	}
}
