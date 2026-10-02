package exercicios;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double[] numeros = new double[5];
		double soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe um número: ");
			numeros[i] = leitor.nextDouble(); 
			soma += numeros[i];
			
		}
		
		double media = soma/numeros.length;
		
		System.out.println("Média: "+media);
		
		leitor.close();
	}

}