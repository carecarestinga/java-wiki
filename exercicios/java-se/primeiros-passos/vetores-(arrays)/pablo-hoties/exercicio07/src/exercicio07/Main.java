package exercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um número inteiro que entrará no vetorA e no indíce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		System.out.println("");
		for (int p = 0; p < vetorB.length; p++) {
			System.out.print("Digite um número inteiro que entrará no vetorB e no indíce " + p + " : ");
			vetorB[p] = ler.nextInt();
		}
		ler.close();
		System.out.println("");
		for (int p = 0; p < vetorC.length; p++) {
			if (vetorA[p] > vetorB[p]) {
				vetorC[p] = vetorA[p] - vetorB[p];
			} else {
				vetorC[p] = vetorB[p] - vetorA[p];
			}
			System.out.println("Mostrando a subtração do vetorA e vetorB no indíce " + p + " : " + vetorC[p]);
		}
	}
}
