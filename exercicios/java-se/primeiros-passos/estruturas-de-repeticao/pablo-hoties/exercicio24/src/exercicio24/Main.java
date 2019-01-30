package exercicio24;

public class Main {

	public static void main(String[] args) {

		double valorCaixaIndividual = 1.99;
		
		for (int i = 1; i <= 50; i++) {
			System.out.printf("%d - R$%.2f%n", i, (valorCaixaIndividual * i));
		}
	}
}
