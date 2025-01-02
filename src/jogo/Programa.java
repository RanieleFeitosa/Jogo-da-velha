package jogo;

import java.util.InputMismatchException;
import java.util.Scanner;

import jogo.exceptions.NumeroNaoValidoException;
import jogo.exceptions.PosicaoNaoDisponivelException;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Jogo jogo = new Jogo();

		tabuleiro(jogo.mat);

		try {
			while (jogo.verificacao()) {

				System.out.print("Tentativa X: ");
				int x = sc.nextInt();
				jogo.jogadaX(x);

				tabuleiro(jogo.mat);

				if (!jogo.verificacao()) {
					break;
				}

				System.out.print("Tentativa O: ");
				int o = sc.nextInt();
				jogo.jogadaO(o);

				tabuleiro(jogo.mat);
			}
		} catch (InputMismatchException e) {
			System.out.println("\nErro. Você não digitou um número válido.");
			sc.nextLine();
		} catch (PosicaoNaoDisponivelException e) {
			System.out.println(e.getMessage());
		} catch (NumeroNaoValidoException e) {
			System.out.println(e.getMessage());
		}
	

	sc.close();

	}

	// imprime o tabuleiro na tela
	public static void tabuleiro(String[][] mat) {
		System.out.println("================");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print("| " + mat[i][j] + "  ");
			}

			System.out.print("|");
			System.out.println();
		}

		System.out.println("================");
		System.out.println();
	}

}
