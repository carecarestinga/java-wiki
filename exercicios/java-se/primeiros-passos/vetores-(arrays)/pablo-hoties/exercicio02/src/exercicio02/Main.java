package exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetorA = new int[8];
		int[] vetorB = new int[8];

		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um inteiro que estar� no ind�ce " + p + " : ");
			vetorA[p] = ler.nextInt();
			vetorB[p] = (vetorA[p] * 2);
		}
		ler.close();
		System.out.println();
		for (int p = 0; p < vetorA.length; p++) {
			System.out.println("Mostrando a multiplica��o por 2 do vetorA e no ind�ce " + p + " : " + vetorB[p]);
		}
	}
}
