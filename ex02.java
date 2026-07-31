package atividades;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreva um número inteiro: ");
		int x = Integer.parseInt(leitor.nextLine());
		
		int y = x % 2;
		
		if (y==0) {
			System.out.println("O número é par.");
		}else {System.out.println("O número é ímpar.");}
		
		leitor.close();
	}

}
