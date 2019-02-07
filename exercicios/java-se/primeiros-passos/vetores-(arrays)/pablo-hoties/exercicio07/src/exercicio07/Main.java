package exercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um n�mero inteiro que entrar� no vetorA e no ind�ce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		System.out.println("");
		for (int p = 0; p < vetorB.length; p++) {
			System.out.print("Digite um n�mero inteiro que entrar� no vetorB e no ind�ce " + p + " : ");
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
			System.out.println("Exibindo o n�mero inteiro que est� no vetorC e no ind�ce " + p + " : " + vetorC[p]);
		}
	}
}
