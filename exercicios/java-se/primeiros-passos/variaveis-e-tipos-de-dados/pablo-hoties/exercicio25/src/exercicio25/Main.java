package exercicio25;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double arquivoEmMegaBytes;
		double velocidadeDeInternetEmMBPS;
		double tempoQueDemorara;
		
		System.out.print("Digite o tamanho do arquivo: ");
		arquivoEmMegaBytes = ler.nextDouble();
		System.out.print("Digite a velocidade do download: ");
		velocidadeDeInternetEmMBPS = ler.nextDouble();
		tempoQueDemorara = arquivoEmMegaBytes / velocidadeDeInternetEmMBPS;
		System.out.printf("O tempo de espera (em segundos) será: %.0f", tempoQueDemorara);
		
		
	}

}
