package exercicio24;

public class Main {

	private static final double VALOR_CAIXA_INDIVIDUAL = 1.99;

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			System.out.printf("%d - R$%.2f%n", i, (VALOR_CAIXA_INDIVIDUAL * i));
		}
	}
}