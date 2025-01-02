package jogo;

import jogo.exceptions.NumeroNaoValidoException;
import jogo.exceptions.PosicaoNaoDisponivelException;

public class Jogo {

	String[][] mat = new String[3][3];

	// preenche o tabuleiro
	public Jogo() {
		int numero = 1;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = Integer.toString(numero);
				numero++;
			}
		}
	}

	String aux;

	// Jogada do jogador X
	public String jogadaX(int jogadaX) {

		aux = Integer.toString(jogadaX);

		if (jogadaX < 1 || jogadaX > 9) {
			throw new NumeroNaoValidoException();
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {

				if (mat[i][j].equals(aux)) {
					mat[i][j] = "X";
					return mat[i][j];
				}	
			}
		}
		
		throw new PosicaoNaoDisponivelException();

	}

	// Jogada do jogador O
	public String jogadaO(int jogadaO) {

		aux = Integer.toString(jogadaO);

		if (jogadaO < 1 || jogadaO > 9) {
			throw new NumeroNaoValidoException();
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {

				if (mat[i][j].equals(aux)) {
					mat[i][j] = "O";
					return mat[i][j];
				}
			}
		}
		
		throw new PosicaoNaoDisponivelException();

	}

	// Verifica se houve vencedores
	public boolean verificacao() {

		// diagonal principal
		for (int i = 0; i < mat.length; i++) {
			if ((mat[0][0].equals("X") && mat[1][1].equals("X") && mat[2][2].equals("X"))) {
				System.out.println("Jogador X ganhou!");
				return false;

			} else if (mat[0][0].equals("O") && mat[1][1].equals("O") && mat[2][2].equals("O")) {
				System.out.println("Jogador O ganhou!");
				return false;
			}

		}

		// segunda diagonal
		for (int i = 0; i < mat.length; i++) {
			if ((mat[0][2].equals("X") && mat[1][1].equals("X") && mat[2][0].equals("X"))) {
				System.out.println("Jogador X ganhou!");
				return false;
			} else if ((mat[0][2].equals("O") && mat[1][1].equals("O") && mat[2][0].equals("O"))) {
				System.out.println("Jogador O ganhou!");
				return false;
			}
		}

		// linhas
		for (int i = 0; i < mat.length; i++) {
			if ((mat[0][0].equals("X") && mat[0][1].equals("X") && mat[0][2].equals("X"))
					|| (mat[1][0].equals("X") && mat[1][1].equals("X") && mat[1][2].equals("X"))
					|| (mat[2][0].equals("X") && mat[2][1].equals("X") && mat[2][2].equals("X"))) {

				System.out.println("Jogador X ganhou!");
				return false;

			} else if ((mat[0][0].equals("O") && mat[0][1].equals("O") && mat[0][2].equals("O"))
					|| (mat[1][0].equals("O") && mat[1][1].equals("O") && mat[1][2].equals("O"))
					|| (mat[2][0].equals("O") && mat[2][1].equals("O") && mat[2][2].equals("O"))) {

				System.out.println("Jogador O ganhou!");
				return false;
			}
		}

		// colunas
		for (int i = 0; i < mat.length; i++) {
			if ((mat[0][0].equals("X") && mat[1][0].equals("X") && mat[2][0].equals("X"))
					|| (mat[0][1].equals("X") && mat[1][1].equals("X") && mat[2][1].equals("X"))
					|| (mat[0][2].equals("X") && mat[1][2].equals("X") && mat[2][2].equals("X"))) {

				System.out.println("Jogador X ganhou!");
				return false;

			} else if ((mat[0][0].equals("O") && mat[1][0].equals("O") && mat[2][0].equals("O"))
					|| (mat[0][1].equals("O") && mat[1][1].equals("O") && mat[2][1].equals("O"))
					|| (mat[0][2].equals("O") && mat[1][2].equals("O") && mat[2][2].equals("O"))) {

				System.out.println("Jogador O ganhou!");
				return false;
			}
		}

		// verifica se todas as posições já estão ocupadas
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (!mat[i][j].equals("X") && !mat[i][j].equals("O")) {
					return true;
				}
			}
		}
		System.out.println("Fim de jogo. Houve um empate!");
		return false;
	}

}
