package Atividade01;

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o número de canais que deseja descrever:");
		int n = leitor.nextInt();
		leitor.nextLine();
		
		Canal [] canais = new Canal[n];
		
		for (int i = 0; i < n; i++) {
			canais [i] = new Canal();
			
			System.out.println("Digite o nome do Canal: ");
			canais[i].nome = leitor.nextLine();
			System.out.println("Digite o nicho do canal: ");
			canais[i].nicho = leitor.nextLine();
			System.out.println("Digite a quantidade de inscritos do canal: ");
			canais[i].inscritos = leitor.nextInt();
			leitor.nextLine();
		}
		
		System.out.println("Canais: ");
		
		for (int i = 0; i < n; i++) {
			canais[i].imprimir();
			canais[i].placa();
			System.out.println();
		}
	
		leitor.close();
	}

}
