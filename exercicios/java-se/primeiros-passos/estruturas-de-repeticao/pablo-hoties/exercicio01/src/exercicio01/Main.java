package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double nota;
		
		System.out.print("Digite um valor entre 0 e 10: ");
		nota = ler.nextDouble();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Digite um valor válido!");
			System.out.print("Digite um valor entre 0 e 10: ");
			nota = ler.nextDouble();
		}
		ler.close();
		System.out.println("Você digitou um valor válido!");
	}
}
