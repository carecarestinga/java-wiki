package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String letra;
		
		System.out.print("Digite m ou f (digite em minúsculo): ");
		letra = ler.next();
		
		switch (letra) {
		case "f":
			System.out.println("Feminino");
			break;
		
		case "m":
			System.out.println("Masculino");
			break;
			
		default:
			System.out.println("Sexo inválido");
		}
		
		
	}

}
