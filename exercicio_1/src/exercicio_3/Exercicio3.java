package exercicio_3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int tamanho = teclado.nextInt();
		
		int [] numero = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++ ) {
			System.out.print("Digite um númnero inteiro: ");
			numero[i] = teclado.nextInt();
		}
		for(int i = 0; i < tamanho; i++ ) {
			System.out.println("O número digitado fo: " + numero[i]);
		}

	}

}
