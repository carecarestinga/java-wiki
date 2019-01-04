package exercicio17;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	double quilometroPercorrido;
	double combustivelGasto;
	double mediaConsumida;
	
	System.out.print("Digite os quilômetros percorrido: ");
	quilometroPercorrido = ler.nextDouble();
	System.out.print("Digite o total de combustível gasto: ");
	combustivelGasto = ler.nextDouble();
	mediaConsumida = combustivelGasto / quilometroPercorrido;
	System.out.printf("A média de litros consumidos é: %.1f", mediaConsumida);
	
	
	
}
}
