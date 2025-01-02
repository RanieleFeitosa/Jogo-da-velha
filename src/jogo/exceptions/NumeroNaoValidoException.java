package jogo.exceptions;

public class NumeroNaoValidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NumeroNaoValidoException() {
		super("\nEsse numero não é válido. Escolha um número disponível entre 1 e 9.");
	}

}
