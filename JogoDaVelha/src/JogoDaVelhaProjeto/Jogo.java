package JogoDaVelhaProjeto;
import java.util.Scanner;

public class Jogo {
	
	private String nome;
	private int Pontos;
	
	public int getPontos() {
		return Pontos;
	}

	public Jogo (String nome) {
		this.nome=nome;
	}
	public String getNome(){
		return nome;
	}
	
	//PR�XIMO PASSO DO M�TODO - CRIAR MATRIZES [3][3]
	//CALCULAR PROBABILIDADE DE VIT�RIAS
	public int Jogar () {
		Scanner input = new Scanner (System.in);
		System.out.println("Jogue seu valor!");
		int i = input.nextInt();
		Pontos=i;
		return Pontos;
	}

	
	
}
