package exercicio16;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	double saldoPorHora;
	double horasPorMes;
	double saldoPorMes;
	
	System.out.print("Digite o quanto você ganha por hora: ");
	saldoPorHora = ler.nextDouble();
	System.out.print("Digite o número de horas trabalhadas por mês: ");
	horasPorMes = ler.nextDouble();
	saldoPorMes = horasPorMes * saldoPorHora;
	System.out.println("Neste mẽs ganhastes: " + saldoPorMes);
	
	
	
}
}
