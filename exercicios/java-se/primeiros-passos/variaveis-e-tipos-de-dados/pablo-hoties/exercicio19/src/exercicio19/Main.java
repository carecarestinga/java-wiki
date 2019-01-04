package exercicio19;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	int temperaturaEmCelsius;
	int temperaturaEmFahrenheit;
	
	System.out.print("Digite uma temperatura em Fahrenheit: ");
	temperaturaEmFahrenheit = ler.nextInt();
	temperaturaEmCelsius = 5 * (temperaturaEmFahrenheit - 32) / 9;
	System.out.println("Essa temperatura em Celsius é: " + temperaturaEmCelsius);
	
	
}
}
