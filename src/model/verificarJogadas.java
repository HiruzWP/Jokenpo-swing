package model;

import view.GameInterface;
import view.JokenPoGUI;

public class verificarJogadas {

	//gera jogada da máquina
	private int gerarJogada() {

		int JogadaOponente = (int) (Math.random() * 3 + 1);

		return JogadaOponente;
	}
	
	public void adicionarPlay(Jogada jogada) {

		verificarVencedor(jogada, gerarJogada());

	}
	
	private void verificarVencedor(Jogada player, int opponent) {
		
		GameInterface resultado = new GameInterface();
		
		if(player == Jogada.PEDRA && opponent == 2) {
			
			System.out.println("Opponent Wins!");
			resultado.exibeResultado("Oponente venceu!");
		
		}else if(player == Jogada.PEDRA && opponent == 3) {
			
			System.out.println("Player Wins!");
			resultado.exibeResultado("Você venceu!");
				
		}else if(player == Jogada.PAPEL && opponent == 1) {
			
			System.out.println("Player Wins!");
			resultado.exibeResultado("Você venceu!");
		
		}else if(player == Jogada.PAPEL && opponent == 3) {
			
			System.out.println("Opponent Wins!");
			resultado.exibeResultado("Oponente venceu!");
			
		}else if(player == Jogada.TESOURA && opponent == 1) {
			
			System.out.println("Opponent Wins!");
			resultado.exibeResultado("Oponente venceu!");
			
		}else if(player == Jogada.TESOURA && opponent == 2) {
			
			System.out.println("Player Wins!");
			resultado.exibeResultado("Você venceu!");
			
		}else {
			
			System.out.println("Draw Game!");
			resultado.exibeResultado("Jogo empatou");
			
		}
	
	
}
