package atividades;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números: ");
		int n = leitor.nextInt();
		
		int [] lista  = new int[n];
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			lista[i] = leitor.nextInt();
		}
		
		int maior = lista[0];
		int menor = lista[0];
		
		for (int i = 0; i < lista.length; i++) {
			maior = Math.max(maior, lista[i]);
			menor = Math.min(menor,lista[i]);
		}
		
		
		System.out.println("Maior número: "+ maior);
		System.out.println("Menor número: "+ menor);

		leitor.close();
	}
	
}
