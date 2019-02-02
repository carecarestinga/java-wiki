package exercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int n;
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println("Entre com o n-ésimo termo da série de fibonacci: ");
		n = ler.nextInt();
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i = 3; i <= n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}
	}
}
