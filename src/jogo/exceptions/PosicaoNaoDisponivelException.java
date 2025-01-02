package jogo.exceptions;

public class PosicaoNaoDisponivelException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PosicaoNaoDisponivelException() {
		super("\nEssa posição não está disponível pois já está ocupada.");
	}

}
