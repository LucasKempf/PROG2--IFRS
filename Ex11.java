package atividades;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
			
		System.out.println("Digite um número inteiro: ");
		int n1 = leitor.nextInt();
		
		System.out.println("Sucessor: "+ (n1+1));
		System.out.println("Antecessor: "+ (n1-1));
			
		leitor.close();
	}

}
