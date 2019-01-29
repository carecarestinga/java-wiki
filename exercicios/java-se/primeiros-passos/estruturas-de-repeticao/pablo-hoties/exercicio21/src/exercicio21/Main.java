package exercicio21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int repeticoes;
		int idade;
		int soma = 0;
		double divisaoEMedia;
		String faixaEtaria = "Vazia";
		
		
		System.out.println("Quantas pessoas teram nesta turma?");
		repeticoes = ler.nextInt();
		
		for (int i = 0; i < repeticoes; i++) {
			System.out.print("Digite uma idade: ");
			idade = ler.nextInt();
			soma = soma + idade;
		}
		
		ler.close();
		divisaoEMedia = soma / repeticoes;
		
		if (divisaoEMedia > 0 && divisaoEMedia < 26) {
			faixaEtaria = "Jovem";
		} else if ( divisaoEMedia > 26 && divisaoEMedia < 61) {
			faixaEtaria = "Adulta";
		} else if (divisaoEMedia > 61) {
			faixaEtaria = "Idosa";
		}
		System.out.println("A faixa etária da turma é: " + faixaEtaria);
		}
	}


