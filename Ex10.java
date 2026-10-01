package atividades;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o sálario mínimo: ");
		double minsal = leitor.nextDouble();
		
		System.out.println("Digite seu sálario: ");
		double sal = leitor.nextDouble();
		
		double result = sal / minsal;
		
		System.out.printf("Você ganha %.2f sálarios mínimos.", result);
		
		
		leitor.close();
	}

}