package exercicio21;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random gerador = new Random();
		
		int[] vetorA = new int[50];
		
		for (int p = 0; p < vetorA.length; p++) {
			vetorA[p] = gerador.nextInt();
		}
		for (int p = 0; p < 15; p++) {
			System.out.printf("%d	\n", vetorA[p]);
		}
		System.out.println("");
		for (int p = 15; p < 30; p++) {
			System.out.printf("%d\n", vetorA[p]);
		}
		System.out.println("");
		for (int p = 30; p < 45; p++) {
			System.out.printf("%d\n", vetorA[p]);
		}
		System.out.println("");
		for (int p = 45; p < 50; p++) {
			System.out.printf("%d\n", vetorA[p]);
		}
	}
}
