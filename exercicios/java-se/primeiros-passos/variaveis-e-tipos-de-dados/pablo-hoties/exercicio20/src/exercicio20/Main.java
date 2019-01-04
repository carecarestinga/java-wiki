package exercicio20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double temperaturaEmCelsius;
		double temperaturaEmFahrenheit;
		
		System.out.print("Digite uma temperatura em Celsius: ");
		temperaturaEmCelsius = ler.nextInt();
		temperaturaEmFahrenheit = 1.8 * temperaturaEmCelsius + 32;
		System.out.printf("A temperatura em Fahrenheit é: %.0f", temperaturaEmFahrenheit);
		
	}

}
