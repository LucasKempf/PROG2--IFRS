package atividades;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual a km inicial do carro: ");
		double kmi = leitor.nextDouble();
		
		System.out.println("Qual a km final do carro: ");
		double kmf = leitor.nextDouble();
		
		System.out.println("Quantos L de combústivel consumidos: ");
		double gas = leitor.nextDouble();
			
		if (gas>0) {
			double media = (kmf - kmi)/ gas;
			System.out.printf("A média de consumo do carro é de %.2f km/L5n", media);
		}else {
			System.out.println(" A quantidade deve ser maior que zero.");
		}
		
		
		leitor.close();
	}

}
