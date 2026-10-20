package Atividade01;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int n = leitor.nextInt();
		leitor.nextLine();
		
		Filme [] filmes = new Filme[n]; 
		
		for (int i = 0; i < n; i++) {
			filmes [i] = new Filme();
			
			System.out.println("Filme "+(i+1));
			System.out.println("Nome filme: ");
			filmes[i].nome = leitor.nextLine();
			System.out.println("Diretor do filme: ");
			filmes[i].diretor = leitor.nextLine();
			System.out.println("Ano lançamento: ");
			filmes[i].ano = leitor.nextInt();
			leitor.nextLine();
		}
		
		System.out.println("Filmes:");
		
		for (int i = 0; i < n; i++) {
			filmes[i].imprimir();
			System.out.println();
		}
		

		leitor.close();
	}

}
