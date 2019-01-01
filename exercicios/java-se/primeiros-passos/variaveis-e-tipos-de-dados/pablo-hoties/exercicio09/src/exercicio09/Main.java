package exercicio09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nome;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.printf("O nome em caixa alta é: %S \n", nome);
	}

}
