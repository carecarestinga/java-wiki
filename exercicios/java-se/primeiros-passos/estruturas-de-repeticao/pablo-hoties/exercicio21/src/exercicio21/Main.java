package exercicio21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int quantidade;
		int idade;
		int soma = 0;
		double media;
		String faixaEtaria = "Vazia";
		
		
		System.out.println("Quantas pessoas teram nesta turma?");
		quantidade = ler.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			System.out.print("Digite uma idade: ");
			idade = ler.nextInt();
			soma = soma + idade;
		}
		
		ler.close();
		media = soma / quantidade;
		
		if (media >= 0 && media <= 25) {
			faixaEtaria = "Jovem";
		} else if ( media >= 26 && media <= 60) {
			faixaEtaria = "Adulta";
		} else if (media >= 61) {
			faixaEtaria = "Idosa";
		}
		System.out.println("A faixa etária da turma é: " + faixaEtaria);
		}
	}


