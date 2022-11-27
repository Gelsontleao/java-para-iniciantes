package variaveis;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {

		//declaração das variáveis
		int dependentes = 0;
		double salario = 0.0;
		String nome;
		
		//chamada do método Scanner
		Scanner teclado = new Scanner(System.in);
		
		//Mensagem que irá aparecer para o usuário
		System.out.print("Digite seu nome: ");
		//texto digitado pelo usuário será armazenado na variável informada
		nome = teclado.next();
		System.out.print("Digite o valor do seu salário: R$ ");
		salario = teclado.nextDouble();
		System.out.print("Digite a quantidade de dependentes: ");
		dependentes = teclado.nextInt();
		
		//Saída para o usuário das informações digitadas
		System.out.println("O nome do funcionário é: " + nome);
		System.out.println("Seu salário é de R$ " + salario);
		System.out.println("Poussi um total de " + dependentes + " dependentes");
	}

}
