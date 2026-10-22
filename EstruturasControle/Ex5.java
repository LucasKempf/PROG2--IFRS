package atividades;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n = leitor.nextInt();
		
		int fatorial = 1;
		
		for (int i = n; i >=1; i--) {
			fatorial = fatorial * i;
		}
		
		System.out.println(n+"!= "+fatorial);
		
		leitor.close();
	}

}