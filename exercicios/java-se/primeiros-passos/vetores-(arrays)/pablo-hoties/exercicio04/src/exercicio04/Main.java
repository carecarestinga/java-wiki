package exercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double[] vetorA = new double[15];
		double[] vetorB = new double[15];
		
		for (int p = 0; p < vetorA.length;  p++) {
			System.out.print("Digite um n�mero inteiro que estar� no vetorA e no ind�ce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		for (int p = 0; p < vetorB.length; p++) {
			vetorB[p] = Math.sqrt(vetorA[p]);
			System.out.printf("Mostrando a raiz quadrada do vetorA no ind�ce %d : %.2f%n", p, vetorB[p]);
		}
	}
}
