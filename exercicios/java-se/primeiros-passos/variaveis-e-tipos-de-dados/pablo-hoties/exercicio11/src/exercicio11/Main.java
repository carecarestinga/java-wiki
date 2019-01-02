package exercicio11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nome;
		int idade;
		double saldo;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = entrada.nextLine();
		System.out.print("Digite uma idade: ");
		idade = entrada.nextInt();
		System.out.print("Digite um saldo: ");
		saldo = entrada.nextDouble();
		System.out.printf("O nome é: %S \n", nome);
		System.out.printf("A idade é: %d \n", idade);
		System.out.printf("O saldo é: %.2f", saldo);
	}

}
