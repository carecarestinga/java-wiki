package exercicio29;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		int[] vetorC = new int[20];
		int contadorpar = 0;
		int contadorimpar = 0;
		
		for (int p = 0; p < vetorA.length; p++) {
			vetorB[p] = Integer.MAX_VALUE;
			vetorC[p] = Integer.MAX_VALUE;
		}
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite n�meros inteiros no vetorA e ind�ce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		for (int p = 0; p < vetorA.length; p++) {
			if (vetorA[p] % 2 == 0) {
				vetorB[contadorpar] = vetorA[p];
				contadorpar++;
			} else {
				vetorC[contadorimpar] = vetorA[p];
				contadorimpar++;
			}
		}
		System.out.println("\nExibindo todos os ind�ces do vetorB (N�meros Pares):\n");
		for (int p = 0; p < vetorB.length; p++) {
			if (vetorB[p] == Integer.MAX_VALUE) {
			} else {
				System.out.println(vetorB[p]);
			}
		}
		System.out.println("\nExibindo todos os ind�ce do vetorC (N�meros �mpares):\n");
		for (int p = 0; p < vetorC.length; p++) {
			if (vetorC[p] == Integer.MAX_VALUE) {
			} else {
				System.out.println(vetorC[p]);
			}
		}
	}
}
