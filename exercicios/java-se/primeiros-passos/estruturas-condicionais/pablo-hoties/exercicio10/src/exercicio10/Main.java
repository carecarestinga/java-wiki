package exercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler  = new Scanner(System.in);
		
		char turno;
		char turnoCaixaBaixa;
		
		System.out.print("Digite em que turno estuda: ");
		turno = ler.next().charAt(0);
		ler.close();
		turnoCaixaBaixa = Character.toLowerCase(turno);
		
		switch (turnoCaixaBaixa) {
			case 'm':
				System.out.println("Bom dia!");
				break;
			case 'v':
				System.out.println("Boa tarde!");
				break;
			case 'n':
				System.out.println("Boa noite!");
				break;
				
			default:
				System.out.println("Faustãao: Errrrrrrrrrrrroou!");
		
		
		}

	}
}
