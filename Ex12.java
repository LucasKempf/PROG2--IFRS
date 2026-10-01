package atividades;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double[] numeros = new double[6];
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite o "+ (i+1) +"º número.");
			numeros[i] = leitor.nextDouble();
		}
		
		double media1 = (numeros[0] + numeros[1] + numeros[2]) / 3;
		double media2 = (numeros[3] + numeros[4] + numeros[5]) / 3;
		
		double soma = media1 + media2;
		double media = (media1 + media2) /2;
		
		System.out.println("A soma das médias é: "+ soma);
		System.out.println("A média das médias é:"+media);
		
		leitor.close();
	}

}
