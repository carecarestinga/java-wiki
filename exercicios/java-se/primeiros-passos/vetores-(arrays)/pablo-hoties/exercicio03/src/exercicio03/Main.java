package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor que est�ra no ind�ce " + i + " : ");
			vetorA[i] = ler.nextInt();
			vetorB[i] = (vetorA[i] * vetorA[i]);
		}
		ler.close();
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Mostrando o que est� no vetorB e no ind�ce " + i + " : " + vetorB[i]);
		}
	}
}