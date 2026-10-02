package atividades;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite o 1º número inteiro: ");
		int valor1 = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Digite o 2º número inteiro: ");
		int valor2 = Integer.parseInt(leitor.nextLine());
		
		int soma = valor1 + valor2;
		int mult = valor1 * valor2;
		int div = valor1 / valor2;
		int restdiv = valor1 % valor2;
		
		System.out.println("Soma dos dois números: " + soma);
		System.out.println("Multiplicação dos dois números " + mult);
		System.out.println("Divisão dos dois númeors: " + div);
		System.out.println("Resto da divisão dos dois números:" + restdiv);
				
		leitor.close();

	}

}
