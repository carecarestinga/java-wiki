package exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetorA = new int[8];
		int[] vetorB = new int[8];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite um inteiro que estar� no ind�ce " + i + " : ");
			vetorA[i] = ler.nextInt();
			vetorB[i] = (vetorA[i] * 2);
		}
		ler.close();
		System.out.println();
		for (int p = 0; p < vetorA.length; p++) {
			System.out.println("Mostrando o que est� no vetorB e no ind�ce " + p + " : " + vetorB[p]);
		}
	}
}