package atividades;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double[] numeros = new double[4];
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o " + (i+1) + "º números: ");
			numeros[i] = leitor.nextDouble();
		}
		
		double soma = 0;
		double maior = numeros[0];
		double menor = numeros[0];
		
		for (int i = 0; i < 4; i++) {
			soma += numeros[i];
			
			if(numeros[i]>maior) {
				maior = numeros[i];
			}
			
			if(numeros[i]<menor) {
				menor = numeros[i];
			}
		}
		
		double media = soma / 4;
		
		System.out.println("Média: " + media);
		System.out.println("Maior número: "+ maior);
		System.out.println("Menor número " + menor);
		
		leitor.close();
	}

}