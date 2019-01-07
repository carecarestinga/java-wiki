package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		char letra;
		char letraCaixaBaixa;
		
		System.out.print("Digite m ou f (digite em minúsculo): ");
//		letra = Character.toLowerCase(ler.next().charAt(0));
		
		letra = ler.next().charAt(0);
		ler.close();
		letraCaixaBaixa = Character.toLowerCase(letra); 
		
		switch (letraCaixaBaixa) {
		case 'f':
			System.out.println("Feminino");
			break;
		
		case 'm':
			System.out.println("Masculino");
			break;
			
		default:
			System.out.println("Sexo inválido");
		}
		
		
	}

}
