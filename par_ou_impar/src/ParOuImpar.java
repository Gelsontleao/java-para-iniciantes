import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) throws InterruptedException {
		
		char[] rounds = new char[3];
		int roundAtual = 0;
		
		System.out.println("Começando PAR ou ÍMPAR, melhor de 3!");
		
		while(roundAtual < 3) {

			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite 0 para PAR e 1 para ÍMPAR");
			int escolha = teclado.nextInt();
			
			if(escolha == 0) {
				System.out.println("O jogador escolheu PAR");
			} else {
				System.out.println("O jogado escolheu ÍMPAR");
			}
				
			System.out.println("Digite um número Inteiro entre 0 e 100");
			int jogada1 = teclado.nextInt();
			
			System.out.println("Agora é a vez da CPU jogar...");
			Thread.sleep(1000);
			int jogada2 = (int) (Math.random() * 100);
			System.out.println("A CPU jogou: " + jogada2);
			
			System.out.println("Calculando o Vencedor");
			Thread.sleep(3000);
			int soma = jogada1 + jogada2;
			boolean resultadoPar = soma % 2 == 0;
			
			if(resultadoPar == true && escolha == 0) {
				System.out.println("O jogador ganhou este round");
				rounds[roundAtual++] = 'J';
			} else if(resultadoPar == false && escolha == 1) {
				System.out.println("O jogador ganhou este round");
				rounds[roundAtual++] = 'J';
			} else {
				System.out.println("A CPU ganhou este round");
				rounds[roundAtual++] = 'C';
			}
			
			if(roundAtual == 2) {
				if(rounds[0] == 'J' && rounds[1] == 'J') {
					System.out.println("O jogador ganhou duas em sequência");
					break;
				} else if(rounds[0] == 'C' && rounds[1] == 'C') {
					System.out.println("A CPU ganhou duas em sequência");
					break;
				}
			} else if(roundAtual == 3) {
				if(rounds[2] == 'J') {
					System.out.println("O jogador ganhou a melhor de 3!");
					break;
				} else if(rounds[2] == 'C') {
					System.out.println("A CPU ganhou a melhor de 3!");
					break;
				}
			}
		}
	}
}
