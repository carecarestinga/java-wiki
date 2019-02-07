package exercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int [10];
		int[] vetorB = new int [10];
		
		for (int p = 0;  p < vetorA.length; p++) {
			System.out.print("Digite o valor que entrará no indíce "  + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		System.out.println("");
		for (int p = 0; p < vetorA.length; p++) {
			vetorB[p] = vetorA[p] * p;
			System.out.println("Mostrando o valor do vetorA que está no indíce " + p + " : " + vetorB[p]);
		}
	}
}
