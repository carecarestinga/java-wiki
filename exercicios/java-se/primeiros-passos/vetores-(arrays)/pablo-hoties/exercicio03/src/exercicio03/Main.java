package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite o valor que est�ra no ind�ce " + p + " : ");
			vetorA[p] = ler.nextInt();
			vetorB[p] = (vetorA[p] * vetorA[p]);
		}
		ler.close();
		System.out.println("");
		for (int p = 0; p < vetorA.length; p++) {
			System.out.println("Mostrando o que est� no vetorB e no ind�ce " + p + " : " + vetorB[p]);
		}
	}
}
