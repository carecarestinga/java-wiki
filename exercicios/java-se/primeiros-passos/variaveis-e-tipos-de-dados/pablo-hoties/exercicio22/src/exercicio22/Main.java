package exercicio22;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	double altura;
	double pesoideal;
	
	System.out.print("Digite uma altura: ");
	altura = ler.nextDouble();
	pesoideal = 72.7 * altura - 58;
	System.out.printf("O peso ideal é: %.2f", pesoideal);

	}
	
}
