package exercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String letra;
		
		System.out.print("Digite uma letra (em minúsculo): ");
		letra = ler.next();
		
		switch (letra) {
		case "a":
			System.out.println("Você digitou uma vogal");
			break;
			
		case "e":
			System.out.println("Você digitou uma vogal");
			break;
			
		case "i":
			System.out.println("Você digitou uma vogal");
			break;
			
		case "o":
			System.out.println("Você digitou uma vogal");
			break;
			
		case "u":
			System.out.println("Você digitou uma vogal");
			break;
			
		default:
			System.out.println("Você digitou uma consoante");
		
		}

	}
}
