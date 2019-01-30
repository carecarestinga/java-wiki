package exercicio22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numeroTurmas;
		int numeroAlunos;
		int soma = 0;
		int media;
		boolean invalido = true;

		System.out.print("Digite a quantidade de turmas:  ");
		numeroTurmas = ler.nextInt();

		for (int i = 1; i <= numeroTurmas; i++) {
			invalido = true;
			do {
				System.out.print("Digite a quantidade de alunos turma " + i + ": ");
				numeroAlunos = ler.nextInt();
			
				if (numeroAlunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Não é permitido mais de 40  em uma turma!");
				}
			} while (invalido);
 			soma = soma + numeroAlunos;

		}
		ler.close();
		media = soma / numeroTurmas;

		System.out.println("A média de alunos por turma é: " + media);
	}
}
