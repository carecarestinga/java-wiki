package br.com.debug;

public class Contador {

	private int resultado = 0;

	public int obterResultado() {
		return resultado;
	}

	public void contar() {
		for (int i = 0; i < 100; i++) {
			resultado += i;
		}
	}

}
