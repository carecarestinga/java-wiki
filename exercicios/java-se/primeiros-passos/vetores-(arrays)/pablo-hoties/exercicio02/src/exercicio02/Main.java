package exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetorA = new int[8];
		int[] vetorB = new int[8];

		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um inteiro que estará no indíce " + p + " : ");
			vetorA[p] = ler.nextInt();
			vetorB[p] = (vetorA[p] * 2);
		}
		ler.close();
		System.out.println();
		for (int p = 0; p < vetorA.length; p++) {
			System.out.println("Mostrando a multiplicação por 2 do vetorA e no indíce " + p + " : " + vetorB[p]);
		}
	}
}
