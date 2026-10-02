package exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do Array: ");
		int tam = leitor.nextInt();
		
		int[] array = new int [tam];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite o número de posição "+ (i+1) + ":");
			array[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Número da "+(i+1)+"ª posição "+array[i]);
		}
		
		
		leitor.close();
	}

}
