package exercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int valori;
		float valorf;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		valori = leia.nextInt();
		
		System.out.println("Digite um número flutuante: ");
		valorf = leia.nextFloat();
		
		System.out.print("Os números digitados foram: " + valori + " " );
		System.out.printf("%.2f", valorf);
		
	}

}
