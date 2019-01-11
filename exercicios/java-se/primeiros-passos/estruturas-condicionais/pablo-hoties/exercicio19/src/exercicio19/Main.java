package exercicio19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int acertos = 0;
		String primeiraPergunta;
		String segundaPergunta;
		String terceiraPergunta;
		String quartaPergunta;
		String quintaPergunta;
		
		System.out.println("Sempre responda com sim ou nao");
		System.out.print("Telefonou para a vítima? ");
		primeiraPergunta = ler.next();
		System.out.print("Esteve no local do crime? ");
		segundaPergunta = ler.next();
		System.out.print("Mora perto da vítima? ");
		terceiraPergunta = ler.next();
		System.out.print("Devia para a vítima? ");
		quartaPergunta = ler.next();
		System.out.print("Já trabalhou com a vítima? ");
		quintaPergunta = ler.next();
		ler.close();
		

		if (primeiraPergunta.equalsIgnoreCase("sim")) {
			acertos += 1;
		} 
		
		if (segundaPergunta.equalsIgnoreCase("sim")) {
			acertos += 1;
		} 
		
		if (terceiraPergunta.equalsIgnoreCase("sim")) {
			acertos += 1;
		} 
		
		if (quartaPergunta.equalsIgnoreCase("sim")) {
			acertos += 1;
		} 
		
		if (quintaPergunta.equalsIgnoreCase("sim")) {
			acertos += 1;
		}
		
		switch (acertos) {
		case 0:
		case 1:
			System.out.println("Você é inocente!");
			break;
			
		case 2:
			System.out.println("Você é suspeito");
			break;
			
		case 3:
		case 4:
			System.out.println("Você é cúmplice!");
			break;
			
		case 5:
			System.out.println("Você é ASSASSINO, some daqui rapá!");
			break;
			
		default:
			System.out.println("Você deve estar nervoso quando respondeu as perguntas, tente novamente com mais calma!");
		}
		
	}

}
