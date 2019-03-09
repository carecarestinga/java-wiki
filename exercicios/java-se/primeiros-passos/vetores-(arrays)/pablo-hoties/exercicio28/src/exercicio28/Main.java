package exercicio28;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[20];
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um número inteiro no vetorA e no indíce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		System.out.println();
		for (int p = 0; p < vetorB.length; p++) {
			System.out.print("Digite um número inteiro no vetorB e no indíce " + p + " : ");
			vetorB[p] = ler.nextInt();
		}
		ler.close();
		for (int p = 0; p < vetorA.length; p++) {
			vetorC[p] = vetorA[p];
		}
		for (int p = 10; p < vetorC.length; p++) {
			vetorC[p] = vetorB[p - 10];
		}
		System.out.println("Exibindo todos os indíces do vetorC:");
		for (int p = 0; p < vetorC.length; p++) {
			System.out.println(vetorC[p]);
		}
	}
}
