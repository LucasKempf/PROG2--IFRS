package arrays;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		//array tem tamanho definido por isso é 
		//mais rápido e aloca menos memória que uma lista
		
		//não conheço os elementos de antemão
		int [] notas = new int[3];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe um número: ");
			notas[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		leitor.close();
	}

}