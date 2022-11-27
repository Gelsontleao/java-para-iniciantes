package Estring;

import java.util.Scanner;

public class Estring {

	public static void main(String[] args) {
		
		String nome1;
		float peso1 = 0f;
		String nome2;
		float peso2 = 0f;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome1 = teclado.next();
		System.out.print("Digite seu peso em kg: ");
		peso1 = teclado.nextFloat();
		System.out.print("Digite seu nome: ");
		nome2 = teclado.next();
		System.out.print("Digite seu peso em kg: ");
		peso2 = teclado.nextFloat();
		
		System.out.println("A pessoa " + nome1 + " tem peso de " + peso1 + " kg");
		System.out.println("A pessoa " + nome2 + " tem peso de " + peso2 + " kg");
		
		if(peso1 > peso2) {
			System.out.println(nome1 + " é mais pesado que " + nome2);
		}else if(peso1 < peso2) {
			System.out.println(nome2 + " é mais pesado que " + nome1);
		}else {
			System.out.println("Ambos possuem o mesmo peso!");
		}
		
	}

}
