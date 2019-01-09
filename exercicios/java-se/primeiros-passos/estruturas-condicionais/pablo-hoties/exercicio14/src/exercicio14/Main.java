package exercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double soma;
		double media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		ler.close();
		soma = nota1 + nota2;
		media = soma / 2;
		
		if (media >= 9.0 && media <= 10.0) {
			System.out.println("A primeira nota " + nota1 + " e a segunda nota " + nota2 + " que totalizou na média " + media + " e com essa média você está aprovado!");
		} else if (media >= 7.5 && media <= 8.9) {
			System.out.println("A primeira nota " + nota1 + " e a segunda nota " + nota2 + " que totalizou na média " + media + " e com essa média você está aprovado!");
		} else if (media >= 6.0 && media <= 7.4) {
			System.out.println("A primeira nota " + nota1 + " e a segunda nota " + nota2 + " que totalizou na média " + media + " e com essa média você está aprovado!");
		} else if (media >= 4.0 && media <= 5.9) {
			System.out.println("A primeira nota " + nota1 + " e a segunda nota " + nota2 + " que totalizou na média " + media + " e com essa média você está reprovado!");
		} else if (media <= 4.0 && media >= 0.0) {
			System.out.println("A primeira nota " + nota1 + " e a segunda nota " + nota2 + " que totalizou na média " + media + " e com essa média você está reprovado!");
		} else {
			System.out.println("A primeira nota " + nota1 + " e a segunda nota " + nota2 + " que totalizou na média " + media + " e com essa média você está mentindo!");
		}
		
	}

}
