package debug02;

public class Main {
	
	private static final String TEXTO_01 = "Socorram-me subi no onibus em Marrocos";
	private static final String TEXTO_02 = "N�o � Pal�ndromo";

	public static void main(String[] args) {
		Palindromo palindromo = new Palindromo();
		
		if (palindromo.ePalindromo(TEXTO_01)) {
			System.out.println("� pal�ndromo!!!");
		} else {
			System.out.println("N�o � pal�ndromo!!!");
		}
		
	}

}