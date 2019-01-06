package debug02;

public class Main {
	
	private static final String TEXTO_01 = "Socorram-me subi no onibus em Marrocos";
	private static final String TEXTO_02 = "Não é Palíndromo";

	public static void main(String[] args) {
		Palindromo palindromo = new Palindromo();
		
		if (palindromo.ePalindromo(TEXTO_01)) {
			System.out.println("É palíndromo!!!");
		} else {
			System.out.println("Não é palíndromo!!!");
		}
		
	}

}