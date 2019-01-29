package exercicio22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int repeticoes = 0;
		int quantidadesDeAlunosPorTurma;
		int soma = 0;
		double divisaoEMedia;
		
		System.out.print("Digite a quantidade de turmas:  ");
		repeticoes = ler.nextInt();
		
		for (int i = 0; i < repeticoes; i++) {
			System.out.print("Digite a quantidade de alunos da turma: ");
			quantidadesDeAlunosPorTurma = ler.nextInt();
			soma = soma + quantidadesDeAlunosPorTurma;
		}
		ler.close();
		divisaoEMedia = soma / repeticoes;
		
		System.out.println("A média de alunos por turma é: " + divisaoEMedia);
	}

}
