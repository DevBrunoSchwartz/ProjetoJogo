package JogoDaVelhaProjeto;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {


		Jogo player1 = new Jogo ("Joao");
		Jogo player2 = new Jogo ("Bruno");
		
		int qtdVitoriasPlayer1=0; int qtdVitoriasPlayer2=0;
		
		for (int i=0; i<3; i++) {
			player1.Jogar();
			player2.Jogar();
			if (player1.getPontos() > player2.getPontos()) {
				System.out.println(player1.getNome()+" venceu!");
				qtdVitoriasPlayer1++;
			}else if (player1.getPontos() < player2.getPontos()){
				System.out.println(player2.getNome()+" venceu!");
				 qtdVitoriasPlayer2=0;
				}else {
				System.out.println("Empate!");		
			}		
		}
		System.out.println(qtdVitoriasPlayer1);
		System.out.println(qtdVitoriasPlayer2);
		
		if(qtdVitoriasPlayer1 > 2 && qtdVitoriasPlayer2 < 4) {
			System.out.println(player1.getNome()+" IMPLACAVEL!");
		}else if (qtdVitoriasPlayer2 > 2 && qtdVitoriasPlayer2 < 4 ) {
			System.out.println(player1.getNome()+" IMPLACAVEL!");
		}else {
			System.out.println("O JOGO ESTÁ EQUILIBRADO!");
		}
		
	}

}