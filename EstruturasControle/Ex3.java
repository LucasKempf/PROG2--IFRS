package atividades;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da área a ser pintada (em metros quadrados): ");
		double area = leitor.nextDouble();
		
		double tinta = area/3;
				
		int latas = (int) Math.ceil(tinta / 10);

        double preco = latas * 50;

        System.out.println("Tinta necessária: " + tinta + " litros.");
        System.out.println("Quantidade de latas: " + latas);
        System.out.printf("Preço total: R$ %.2f%n", preco);

		leitor.close();
	}

}