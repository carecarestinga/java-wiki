package exercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um número inteiro que estará no vetorA e no indíce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		System.out.println("");
		for (int p = 0; p < vetorB.length; p++) {
			vetorB[p] = vetorA[p]  % 2;
			System.out.println("Mostrando um número inteiro do vetorB que está no indíce " + p + " : " + vetorB[p]);
		}
	}
}
