package exercicio27;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int i = 9;
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um número inteiro no vetorA e indíce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		System.out.println();
		for (int p = 0; p < vetorB.length; p++) {
			vetorB[p] = vetorA[i];
			i--;
		}
		System.out.println("Exibindo todos os indíces do vetorB:");
		System.out.println();
		for(int p = 0; p < vetorB.length; p++) {
			System.out.println(vetorB[p]);
		}
	}

}
