package exercicios;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int[] array = new int[5];
		int soma = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite o "+ (i+1) +"º número:");
			array[i] = leitor.nextInt();
			if (array[i]<0) {
				soma += 1; 
			}
		}
		
		System.out.println("Quantidade de números negativos no Array: "+soma);
		
		System.out.println("Números positivos:");
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] >0) {
				System.out.println(array[i]);
			}
		}
		
		leitor.close();
	}

}