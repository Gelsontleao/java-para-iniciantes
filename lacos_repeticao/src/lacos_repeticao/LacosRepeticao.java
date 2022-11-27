package lacos_repeticao;

public class LacosRepeticao {

	public static void main(String[] args) {
		
		int x = 1;
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println("-----Sem Laço de Repetição-----");
		
		for(int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("-----Laço For-----");
		
		int i = 1;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----Laço While-----");
		
		i = 1;
		do {
			System.out.println(i);
		}while(i++ < 10);
		System.out.println("-----Laço Do-While-----");
	}

}
