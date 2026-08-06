package atividades;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Digite outro número inteiro: ");
		int n2 = Integer.parseInt(leitor.nextLine());
		// int n1 = leitor.nextInt();
		
		if (n1==n2) {
			System.out.println("Os números são iguais.");
		}else { System.out.println("Os números são diferentes.");
			if (n1 > n2) { System.out.println("O maior número é: "+n1);
		}else {System.out.println("O maior número é: "+n2);
		}
		}
		
		//poderia usar a class Math.max(n1, n2)
		//  System.out.println("O maior número é: " + (n1 > n2 ? n1 : n2)); 
		//? é o sinal do operador ternário este toma decições simples entre dois elementos
		//condição ? valorSeVerdadeiro : valorSeFalso;
		
		leitor.close();
	}
}
