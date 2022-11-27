package exercicio_2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite uma vogal: ");
		
		//pega a primeira letra digitada e converte para maiúscula
		char letra = teclado.next().toUpperCase().charAt(0);
		
		switch(letra) {
		case 'A': System.out.print("Vogal A");
			break;
		case 'E': System.out.print("Vogal E");
			break;
		case 'I': System.out.print("Vogal I");
			break;
		case 'O': System.out.print("Vogal O");
			break;
		case 'U': System.out.print("Vogal U");
			break;
		default: System.out.print("Não é uma vogal");
		}

	}

}
