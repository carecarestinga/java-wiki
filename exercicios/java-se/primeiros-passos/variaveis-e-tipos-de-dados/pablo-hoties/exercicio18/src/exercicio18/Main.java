package exercicio18;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nomeAluno;
		double notaProva1;
		double notaProva2;
		double notaProva3;
		double mediaSemestral;
		double soma;

		System.out.print("Digite o nome do aluno: ");
		nomeAluno = ler.next();
		System.out.print("Digite a nota da primeira prova: ");
		notaProva1 = ler.nextDouble();
		System.out.print("Digite a nota da segunda prova: ");
		notaProva2 = ler.nextDouble();
		System.out.print("Digite a nota da segunda prova: ");
		notaProva3 = ler.nextDouble();
		soma = notaProva1 + notaProva2 + notaProva3;
		mediaSemestral = soma / 3;
		System.out.print("A média do aluno " + nomeAluno + " é: ");
		System.out.printf("%.1f", mediaSemestral);

	}
}
