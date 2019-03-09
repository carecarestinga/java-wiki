package exercicio26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um n�mero inteiro no vetorA e no ind�ce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		System.out.println();
		for (int p = 0; p < vetorB.length; p++) {
			System.out.print("Digite um n�mero inteiro no vetorB e no ind�ce " + p + " : ");
			vetorB[p] = ler.nextInt();
		}
		ler.close();
		System.out.println();
		for (int p = 0; p < vetorA.length; p++) {
			if (vetorA[p] < 7) {
				vetorB[p] = 'a';
			} else if (vetorA[p] == 7) {
				vetorB[p] = 'b';
			} else if (vetorA[p] > 7 && vetorA[p] < 10) {
				vetorB[p] = 'c';
			} else if (vetorA[p] == 10) {
				vetorB[p] = 'd';
			} else if (vetorA[p] > 10) {
				vetorB[p] = 'e';
			}
		}
		System.out.println();
		System.out.println("Exibindo todos os ind�ces do vetorB:");
		for (int p = 0; p < vetorB.length; p++) {
			System.out.println(vetorB[p]);
		}
		
	} 

}
