package exercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numero;
		int numerosPares = 0;
		int numerosImpares = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro: ");
			numero = ler.nextInt();
			
			if (numero % 2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;
			}
		}
		
		ler.close();
		System.out.println("A quantidade de números pares são: " + numerosPares);
		System.out.println("A quantidade de números ímpares são: " + numerosImpares);
		
	}

}
