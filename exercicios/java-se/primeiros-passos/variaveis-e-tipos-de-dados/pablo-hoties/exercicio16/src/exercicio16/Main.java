package exercicio16;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	double saldophora;
	double horaspmes;
	double saldopdia;
	double saldopmes;
	
	System.out.println("Digite o quanto você ganha por hora: ");
	saldophora = ler.nextDouble();
	System.out.println("Digite o número de horas trabalhadas por mês: ");
	horaspmes = ler.nextDouble();
	saldopdia = saldophora * 24;
	saldopmes = saldopdia * 30;
	
	System.out.println("Neste mẽs ganhastes: " + saldopmes);
	
}
}
