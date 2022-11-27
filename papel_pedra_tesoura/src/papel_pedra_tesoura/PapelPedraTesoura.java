package papel_pedra_tesoura;

import java.util.Scanner;

public class PapelPedraTesoura {

	public static void main(String[] args) throws InterruptedException {
		
		while(true) {
		
			//Inicializa a leitura do teclado e armazena o valor digitado na variável
			Scanner teclado = new Scanner(System.in);
			System.out.println("Escolha 1 para PAPEL, 2 para PEDRA ou 3 para TESOURA");
			int jogada1 = teclado.nextInt();
			
			//Mostra a escolha do jogador
			if(jogada1 == 1) {
				System.out.println("O jogador escolheu PAPEL");
			} else if(jogada1 == 2) {
				System.out.println("O jogador escolheu PEDRA");
			} else {
				System.out.println("O jogador escolheu TESOURA");
			}
			
			//Gera um número aleatório entre 1 e 3
			System.out.println("Agora é a vez da CPU jogar...");
			Thread.sleep(1000);
			int jogada2 = (int) (Math.random() * 3) + 1;
	
			//Mostra a escolha da CPU
			if(jogada2 == 1) {
				System.out.println("A CPU escolheu PAPEL");
			} else if(jogada2 == 2) {
				System.out.println("A CPU escolheu PEDRA");
			} else {
				System.out.println("A CPU escolheu TESOURA");
			}
			
			//Compara os valores e informa o vencedor
			System.out.println("Processando o vencedor!");
			Thread.sleep(2000);
			if(jogada1 == jogada2) {
				System.out.println("Empatou!, jogar novamente!");
			} else if((jogada1 == 1 && jogada2 == 2) || (jogada1 == 2 && jogada2 == 3)
					|| (jogada1 == 3 && jogada2 == 1)) {
				System.out.println("Uho, o jogador ganhou!!!");
				break;
			} else {
				System.out.println("Se deu mal, a CPU ganhou");
				break;
			}
			
		}

	}

}
