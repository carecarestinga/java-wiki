package exercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um n�mero inteiro que estar� no vetorA e no ind�ce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		System.out.println("");
		for (int p = 0; p < vetorB.length; p++) {
			vetorB[p] = vetorA[p]  % 2;
			System.out.println("Exibindo o resto da divis�o do vetorA por 2 no ind�ce " + p + " : " + vetorB[p]);
		}
	}
}
