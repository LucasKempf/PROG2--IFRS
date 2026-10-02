package atividades;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o raio da esfera: ");
		double r = leitor.nextDouble();
		
		double volume = (4.0/3.0) * Math.PI * Math.pow(r, 3);
		// os números precisam ser 4.0 e 3.0 se não ele faz a divisão inteira
		
		System.out.println("O volume da esfera é "+volume +" cm³");
		
		leitor.close();
	}

}
