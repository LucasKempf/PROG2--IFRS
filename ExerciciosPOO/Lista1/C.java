package Atividade01;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Smartphone c1 = new Smartphone();
		System.out.println("Marca: ");
		c1.marca = leitor.nextLine();
		System.out.println("Armazenamento em GB: ");
		c1.armazenamento = leitor.nextInt();
		System.out.println("Preço em R$: ");
		c1.preco = leitor.nextDouble();
		leitor.nextLine();
		//para limpar o buffer e não dar erro.
		//Porque a primeira leitura da marca é a primeira coisa do 
		//programa, então o buffer está limpo. O problema só aparece 
		//quando um nextLine() vem depois de um nextInt() ou nextDouble()
		
		Smartphone c2 = new Smartphone();
		System.out.println("Marca: ");
		c2.marca = leitor.nextLine();
		System.out.println("Armazenamento em GB: ");
		c2.armazenamento = leitor.nextInt();
		System.out.println("Preço em R$: ");
		c2.preco = leitor.nextDouble();
		
		
		c1.comparaPreco(c2);
		
		c1.imprimir();
		c2.imprimir();
		
		leitor.close();
	}

}
